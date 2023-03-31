package com.parim.ap2023.mario.view;

import com.parim.ap2023.mario.FontCreator;
import com.parim.ap2023.mario.view.objects.LabelCreator;

public class RegisterPage extends AccountPage {
    @Override
    public void setLabel() {
        label = new LabelCreator("Register a new account", FontCreator.titleFont);
        this.add(label);
    }

    @Override
    public void validInput() {
        if (super.isDefaultValue()) return;
        // TODO: if username is not used
        MainFrame.getInstance().setMenuPage();
    }
}
