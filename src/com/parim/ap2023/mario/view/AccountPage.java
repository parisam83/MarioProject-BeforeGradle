package com.parim.ap2023.mario.view;

import com.parim.ap2023.mario.view.objects.ButtonCreator;
import com.parim.ap2023.mario.view.objects.LabelCreator;
import com.parim.ap2023.mario.view.objects.TextFieldCreator;

import javax.swing.*;
// screen size changes
// check if implementing ActionListener in FirstPage solves the bug or not
public abstract class AccountPage extends JPanel {
    private static final int textFieldLabelGap = 230;
    protected LabelCreator label;
    protected TextFieldCreator username, password;
    public AccountPage(){
        setLabel();
        this.add(label);

        username = new TextFieldCreator(textFieldLabelGap, "username");
        this.add(username);

        password = new TextFieldCreator(textFieldLabelGap + TextFieldCreator.getTextFieldGap(), "password");
        this.add(password);

        ButtonCreator nextButton = new ButtonCreator(MainFrame.getGameWidth()/2 + 300, textFieldLabelGap + TextFieldCreator.getTextFieldGap()*7/3, ButtonCreator.getNextButtonWidth(), ButtonCreator.getNextButtonHeight(), "Next >>");
        nextButton.addActionListener(e -> validInput());
        this.add(nextButton);

        ButtonCreator backButton = new ButtonCreator(MainFrame.getGameWidth()/2 - 300 - ButtonCreator.getNextButtonWidth(), textFieldLabelGap + TextFieldCreator.getTextFieldGap()*7/3, ButtonCreator.getNextButtonWidth(), ButtonCreator.getNextButtonHeight(), "<< Back");
        backButton.addActionListener(e -> MainFrame.getInstance().setFirstPage());
        this.add(backButton);

        this.setLayout(null);
        this.setPreferredSize(MainFrame.getScreenSize());
    }

    public abstract void setLabel();
    public abstract void validInput();
    public boolean isDefaultValue(){
        return username.getText().equals("username") && password.getText().equals("password");
    }
}
