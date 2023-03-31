package com.parim.ap2023.mario.view;

import com.parim.ap2023.mario.FontCreator;
import com.parim.ap2023.mario.view.objects.ButtonCreator;
import com.parim.ap2023.mario.view.objects.LabelCreator;

import javax.swing.*;

public class MenuPage extends JPanel {
    private static final int buttonLabelGap = 180;
    public MenuPage(){
        LabelCreator label = new LabelCreator("Super Xayyati Game!", FontCreator.titleFont);
        this.add(label);

        ButtonCreator newGameButton = new ButtonCreator(MainFrame.getGameWidth()/2 - 100 - ButtonCreator.getNormalButtonWidth(), buttonLabelGap, "Start new game");
        // TODO: newGameButton.addActionListener(e -> ...);
        this.add(newGameButton);

        ButtonCreator prevGameButton = new ButtonCreator(MainFrame.getGameWidth()/2 - 100 - ButtonCreator.getNormalButtonWidth(), buttonLabelGap + (ButtonCreator.getButtonGap() - 10), "Continue previous games", FontCreator.font.deriveFont(35f));
        // TODO: prevGameButton.addActionListener(e -> ...);
        this.add(prevGameButton);

        ButtonCreator leaderBoardButton = new ButtonCreator(buttonLabelGap + (ButtonCreator.getButtonGap() - 10)*2, "Leaderboard");
        // TODO: leaderBoardButton.addActionListener(e -> ...);
        this.add(leaderBoardButton);

        ButtonCreator shopButton = new ButtonCreator(MainFrame.getGameWidth()/2 + 100, buttonLabelGap, "Shop");
        // TODO: shopButton.addActionListener(e -> ...);
        this.add(shopButton);

        ButtonCreator profileButton = new ButtonCreator(MainFrame.getGameWidth()/2 + 100, buttonLabelGap + (ButtonCreator.getButtonGap() - 10), "Profile");
        // TODO: profileButton.addActionListener(e -> ...);
        this.add(profileButton);

        ButtonCreator backButton = new ButtonCreator(buttonLabelGap + (ButtonCreator.getButtonGap() - 10)*3-10, "<< Back <<");
        backButton.addActionListener(e -> MainFrame.getInstance().setFirstPage());
        this.add(backButton);

        this.setLayout(null);
        this.setPreferredSize(MainFrame.getScreenSize());
    }
}
