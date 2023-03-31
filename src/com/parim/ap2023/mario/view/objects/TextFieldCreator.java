package com.parim.ap2023.mario.view.objects;

import com.parim.ap2023.mario.FontCreator;
import com.parim.ap2023.mario.view.MainFrame;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class TextFieldCreator extends JTextField {
    private static final int textFieldGap = 180;
    private int textFieldWidth = 350, textFieldHeight = 120;
    private int x = 0, y = 0;
    private final String text;
    public JTextField bull;

    public TextFieldCreator(String text){
        this.text = text;
        createTextField();
    }
    public TextFieldCreator(int y, String text){
        this.x = MainFrame.getGameWidth()/2 - textFieldWidth/2;
        this.y = y;
        this.text = text;
        createTextField();
    }
    public TextFieldCreator(int x, int y, String text){
        this.x = x;
        this.y = y;
        this.text = text;
        createTextField();
    }
    public TextFieldCreator(int x, int y, int textFieldWidth, int textFieldHeight, String text){
        this.x = x;
        this.y = y;
        this.text = text;
        this.textFieldWidth = textFieldWidth;
        this.textFieldHeight = textFieldHeight;
        createTextField();
    }
    public void createTextField(){
        bull = this;
        this.setText(text);
        this.setFont(FontCreator.buttonFont);
        this.setBounds(x, y, textFieldWidth, textFieldHeight);
        this.setHorizontalAlignment(JTextField.CENTER);
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                bull.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
    }

    public static int getTextFieldGap() {
        return textFieldGap;
    }
}
