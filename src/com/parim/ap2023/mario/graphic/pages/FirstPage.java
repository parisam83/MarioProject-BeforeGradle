package com.parim.ap2023.mario.graphic.pages;

import com.parim.ap2023.mario.graphic.Frame;
import com.parim.ap2023.mario.graphic.objects.ButtonCreator;
import com.parim.ap2023.mario.graphic.FontCreator;
import com.parim.ap2023.mario.graphic.objects.LabelCreator;

import javax.swing.*;

import static java.lang.System.exit;

public class FirstPage extends JPanel {
    private static final int buttonLabelGap = 230;
    public FirstPage(){
        LabelCreator label = new LabelCreator("Please register or login to your account", FontCreator.titleFont);
        this.add(label);

        ButtonCreator registerButton = new ButtonCreator(buttonLabelGap, "Register");
        registerButton.addActionListener(e -> Frame.getFrame().setContentPane(new RegisterPage()));
        this.add(registerButton);

        ButtonCreator loginButton = new ButtonCreator(buttonLabelGap + ButtonCreator.getButtonGap(), "Login");
        loginButton.addActionListener(e -> Frame.getFrame().setContentPane(new LoginPage()));
        this.add(loginButton);

        ButtonCreator exitButton = new ButtonCreator(buttonLabelGap + ButtonCreator.getButtonGap()*2, "Exit");
        exitButton.addActionListener(e -> exit(0));
        this.add(exitButton);

        this.setLayout(null);
        this.setPreferredSize(Frame.getScreenSize());
    }
}