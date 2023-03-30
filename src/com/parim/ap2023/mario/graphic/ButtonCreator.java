package com.parim.ap2023.mario.graphic;

import javax.swing.*;

public class ButtonCreator extends JButton {
    private int buttonWidth = 150, buttonHeight = 100;
    public ButtonCreator(int x, int y, String text){
        this.setBounds(x, y, buttonWidth, buttonHeight);
        this.setText(text);
        this.setFocusable(false);
    }
    public ButtonCreator(int x, int y, int buttonWidth, int buttonHeight, String text){
        this.buttonWidth = buttonWidth;
        this.buttonHeight = buttonHeight;
        this.setBounds(x, y, buttonWidth, buttonHeight);
        this.setText(text);
        this.setFocusable(false);
        //this.setOpaque(false);
    }
}
