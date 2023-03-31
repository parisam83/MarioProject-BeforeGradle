package com.parim.ap2023.mario.graphic.pages;

import com.parim.ap2023.mario.graphic.Frame;
import com.parim.ap2023.mario.graphic.objects.ButtonCreator;
import com.parim.ap2023.mario.graphic.objects.LabelCreator;
import com.parim.ap2023.mario.graphic.objects.TextFieldCreator;

import javax.swing.*;
// screen size changes
// check if implementing ActionListener in FirstPage solves the bug or not
public abstract class AccountPage extends JPanel {
    private static final int textFieldLabelGap = 230;
    protected LabelCreator label;
    public AccountPage(){
        setLabel();
        this.add(label);

        TextFieldCreator username = new TextFieldCreator(textFieldLabelGap, "username");
        this.add(username);

        TextFieldCreator password = new TextFieldCreator(textFieldLabelGap + TextFieldCreator.getTextFieldGap(), "password");
        this.add(password);

        ButtonCreator nextButton = new ButtonCreator(Frame.getGameWidth()/2 + 300, textFieldLabelGap + TextFieldCreator.getTextFieldGap()*7/3, ButtonCreator.getNextButtonWidth(), ButtonCreator.getNextButtonHeight(), "Next >>");
        this.add(nextButton);

        ButtonCreator backButton = new ButtonCreator(Frame.getGameWidth()/2 - 300 - ButtonCreator.getNextButtonWidth(), textFieldLabelGap + TextFieldCreator.getTextFieldGap()*7/3, ButtonCreator.getNextButtonWidth(), ButtonCreator.getNextButtonHeight(), "<< Back");
        backButton.addActionListener(e -> Frame.getFrame().setContentPane(new FirstPage()));
        this.add(backButton);

        this.setLayout(null);
        this.setPreferredSize(Frame.getScreenSize());
        Frame.getFrame().pack();
    }

    public abstract void setLabel();
}
