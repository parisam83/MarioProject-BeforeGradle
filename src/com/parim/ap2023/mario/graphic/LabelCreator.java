package com.parim.ap2023.mario.graphic;

import javax.swing.*;
import java.awt.*;

public class LabelCreator extends JLabel {
    private static final int gameWidth = 1500, gameHeight = 832;
    private int x = 0, y = 0;
    private final Font font;
    private final String text;

    public LabelCreator(String text, Font font){
        this.text = text;
        this.font = font;
        createLabel();
    }

    public LabelCreator(int x, int y, String text, Font font){
        this.x = x;
        this.y = y;
        this.text = text;
        this.font = font;
        createLabel();
    }

    public void createLabel(){
        this.setText(text);
        this.setFont(font);
        this.setBounds(x, y, gameWidth, gameHeight);
        this.setVerticalAlignment(JLabel.TOP);
        this.setHorizontalAlignment(JLabel.CENTER);
    }
}
