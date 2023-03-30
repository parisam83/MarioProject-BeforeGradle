package com.parim.ap2023.mario.graphic;

import javax.swing.*;

public class ButtonCreator extends JButton {
    private static final int buttonGap = 50;
    private int buttonWidth = 150, buttonHeight = 100;
    private final int x, y;
    private final String text;

    public ButtonCreator(int x, int y, String text){
        this.x = x;
        this.y = y;
        this.text = text;
        createButton();
    }
    public ButtonCreator(int x, int y, int buttonWidth, int buttonHeight, String text){
        this.x = x;
        this.y = y;
        this.text = text;
        this.buttonWidth = buttonWidth;
        this.buttonHeight = buttonHeight;
        createButton();
    }

    public void createButton(){
        this.setBounds(x, y, buttonWidth, buttonHeight);
        this.setText(text);
        this.setFocusable(false);
    }

    public int getButtonWidth() {
        return buttonWidth;
    }

    public int getButtonHeight() {
        return buttonHeight;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public String getText() {
        return text;
    }
}
