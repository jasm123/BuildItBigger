package com.example.User.myapplication.backend;

import com.example.JokeTeller;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        JokeTeller jokeTeller=new JokeTeller();
        myData=jokeTeller.tellJoke();
        return myData;
    }


}