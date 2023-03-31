package com.parim.ap2023.mario.events;

import java.util.EventObject;

public class RegistrationFormEvent extends EventObject {
    private String username, password1, password2;
    public RegistrationFormEvent(Object source, String username, String password1, String password2) {
        super(source);
        this.username = username;
        this.password1 = password1;
        this.password2 = password2;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }
}
