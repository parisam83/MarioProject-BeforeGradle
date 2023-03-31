package com.parim.ap2023.mario.view.objects;

import com.parim.ap2023.mario.FontCreator;
import com.parim.ap2023.mario.listeners.StringListener;
import com.parim.ap2023.mario.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonCreator extends JButton {
    private static final int buttonGap = 180, nextButtonWidth = 300, nextButtonHeight = 100;
    private int buttonWidth = 350, buttonHeight = 120;
    private int x = 0, y = 0;
    private final String text;
    private ArrayList<StringListener> stringListeners = new ArrayList<>();

    public ButtonCreator(String text){
        this.text = text;
    }
    public ButtonCreator(int y, String text){
        this.x = MainFrame.getGameWidth()/2 - buttonWidth/2;
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

    public static int getNextButtonWidth() {
        return nextButtonWidth;
    }

    public static int getNextButtonHeight() {
        return nextButtonHeight;
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
