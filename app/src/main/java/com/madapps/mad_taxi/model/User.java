package com.madapps.mad_taxi.model;

/**
 * Created by shehan_k on 11/7/2017.
 */

public class User {

    private String name,email,password,phone;

    public User(String name, String email, String password, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }
}
