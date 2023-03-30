package com.parim.ap2023.mario.graphic.pages;

import com.parim.ap2023.mario.graphic.ButtonCreator;
import com.parim.ap2023.mario.graphic.FontCreator;
import com.parim.ap2023.mario.graphic.Frame;
import com.parim.ap2023.mario.graphic.LabelCreator;

import javax.swing.*;
import java.awt.*;

public class FirstPage extends JPanel {
    private static final int buttonLabelGap = 230;
    public FirstPage(){
        LabelCreator label = new LabelCreator("Please register or login to your account", FontCreator.titleFont);
        this.add(label);

        ButtonCreator registerButton = new ButtonCreator(buttonLabelGap, "Register");
        this.add(registerButton);

        ButtonCreator loginButton = new ButtonCreator(buttonLabelGap + ButtonCreator.getButtonGap(), "Login");
        this.add(loginButton);

        ButtonCreator exitButton = new ButtonCreator(buttonLabelGap + ButtonCreator.getButtonGap()*2, "Exit");
        this.add(exitButton);

        this.setLayout(null);
    }
}