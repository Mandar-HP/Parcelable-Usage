package com.example.parcellable;

import android.content.Intent;

import org.parceler.Parcel;

@Parcel
public class UserData {

    String username;
    int pass;

    // THIS CONSTRUCTOR IS REQUIRED WHEN WE UNWRAP PARCEL AND INITIALIZE OBJ :
    public UserData() {
    }

    public UserData(String username, int pass) {
        this.username = username;
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }


    // TO STRING IS REQUIRED AS WE ARE ACCESSING OBJECT PARAMETERS WHICH SHOULD BE READABLE :
    @Override
    public String toString() {
        return "UserData{" +
                "username='" + username + '\'' +
                ", pass=" + pass +
                '}';
    }
}
