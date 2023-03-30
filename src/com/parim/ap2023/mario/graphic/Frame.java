package com.parim.ap2023.mario.graphic;
import com.parim.ap2023.mario.graphic.pages.FirstPage;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    static FirstPage firstPage;
    static final int width = 1500, height = 832;
    static final Dimension screenSize = new Dimension(width, height);
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
}