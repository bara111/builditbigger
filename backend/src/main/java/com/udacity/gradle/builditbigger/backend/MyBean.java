package com.udacity.gradle.builditbigger.backend;

import com.lawerance.jokes.jokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private com.lawerance.jokes.jokes jokes;

    public MyBean(){
        jokes=new jokes();
    }

    public String getJoke(){
        return jokes.getJoke();
    }
}