package com.parim.ap2023.mario.graphic.pages;

import com.parim.ap2023.mario.graphic.FontCreator;
import com.parim.ap2023.mario.graphic.Frame;
import com.parim.ap2023.mario.graphic.objects.LabelCreator;

import javax.swing.*;

public class LoginPage extends AccountPage{
    @Override
    public void setLabel() {
        label = new LabelCreator("Login to your account", FontCreator.titleFont);
        this.add(label);
    }
}
