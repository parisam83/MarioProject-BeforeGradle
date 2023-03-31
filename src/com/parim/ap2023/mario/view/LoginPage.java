package com.parim.ap2023.mario.view;

import com.parim.ap2023.mario.FontCreator;
import com.parim.ap2023.mario.view.objects.LabelCreator;

public class LoginPage extends AccountPage{
    @Override
    public void setLabel() {
        label = new LabelCreator("Login to your account", FontCreator.titleFont);
        this.add(label);
    }

    @Override
    public void validInput() {
        if (super.isDefaultValue()) return;
        // TODO: if username and password is correct
        MainFrame.getInstance().setMenuPage();
    }
}
