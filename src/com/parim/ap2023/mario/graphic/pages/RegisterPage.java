package com.parim.ap2023.mario.graphic.pages;

import com.parim.ap2023.mario.graphic.FontCreator;
import com.parim.ap2023.mario.graphic.objects.LabelCreator;

public class RegisterPage extends AccountPage {
    @Override
    public void setLabel() {
        label = new LabelCreator("Register a new account", FontCreator.titleFont);
        this.add(label);
    }
}
