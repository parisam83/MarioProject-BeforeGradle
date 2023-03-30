package com.parim.ap2023.mario.graphic.pages;

import com.parim.ap2023.mario.graphic.ButtonCreator;
import com.parim.ap2023.mario.graphic.FontCreator;
import com.parim.ap2023.mario.graphic.LabelCreator;

import javax.swing.*;
import java.awt.*;

public class FirstPage extends JPanel {
    public FirstPage(){
        LabelCreator label = new LabelCreator("Please Login to your account or register in the game", FontCreator.titleFont);
        this.add(label);

        ButtonCreator button = new ButtonCreator(500, 500, "sth");
        this.add(button);
        this.setLayout(null);
    }
}