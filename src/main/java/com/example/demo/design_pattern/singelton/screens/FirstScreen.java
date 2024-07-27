package com.example.demo.design_pattern.singelton.screens;

import com.example.demo.design_pattern.singelton.UserSingleton;

public class FirstScreen {

    public FirstScreen() {
        System.out.println("Running FirstScreen");
        printUser();
    }

    private void printUser(){
        System.out.println("First Screen ===> Printing user");
        System.out.println(UserSingleton.getInstance());
        System.out.println("===============================");
        System.out.println();
    }
}