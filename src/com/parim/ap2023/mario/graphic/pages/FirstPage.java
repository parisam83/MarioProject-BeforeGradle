package com.parim.ap2023.mario.graphic.pages;

import com.parim.ap2023.mario.graphic.ButtonCreator;

import javax.swing.*;
import java.awt.*;

public class FirstPage extends JPanel {
    public FirstPage(){
        ButtonCreator button = new ButtonCreator(100, 100, "sth");
        this.add(button);
    }
}
