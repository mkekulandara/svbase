package com.madlabtech.baseapp.controller.customer;

/**
 * Created by Madhukara on 5/23/17.
 */
public class CustomerRequest {

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
