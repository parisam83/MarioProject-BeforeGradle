package com.parim.ap2023.mario.graphic;

import javax.swing.*;

public class ButtonCreator extends JButton {
    private static final int buttonGap = 180;
    private int buttonWidth = 350, buttonHeight = 120;
    private int x = 0, y = 0;
    private final String text;

    public ButtonCreator(String text){
        this.text = text;
    }
    public ButtonCreator(int y, String text){
        this.x = Frame.getGameWidth()/2 - buttonWidth/2;
        this.y = y;
        this.text = text;
        createButton();
    }
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
        this.setText(text);
        this.setFont(FontCreator.buttonFont);
        this.setBounds(x, y, buttonWidth, buttonHeight);
        this.setFocusable(false);
    }

    public int getButtonWidth() {
        return buttonWidth;
    }

    public int getButtonHeight() {
        return buttonHeight;
    }

    public static int getButtonGap() {
        return buttonGap;
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
