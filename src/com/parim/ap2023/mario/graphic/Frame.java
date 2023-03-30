package com.parim.ap2023.mario.graphic;
import com.parim.ap2023.mario.graphic.pages.FirstPage;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private static FirstPage firstPage;
    private static final int gameWidth = 1500, gameHeight = 832;
    private static final Dimension screenSize = new Dimension(gameWidth, gameHeight);
    public Frame(){
        this.setTitle("Super Xayyati Game!");
        this.setSize(screenSize);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setFirstPage();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void setFirstPage(){
        if (firstPage == null) firstPage = new FirstPage();
        this.setContentPane(firstPage);
        //this.pack();
    }

    public static int getGameWidth() {
        return gameWidth;
    }

    public static int getGameHeight() {
        return gameHeight;
    }
}