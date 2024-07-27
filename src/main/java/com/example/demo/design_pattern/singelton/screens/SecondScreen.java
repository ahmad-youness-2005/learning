package com.example.demo.design_pattern.singelton.screens;

import com.example.demo.design_pattern.singelton.UserSingleton;

public class SecondScreen {

    public SecondScreen() {
        System.out.println("Running SecondScreen");
        printUser();
    }

    private void printUser(){
        System.out.println("Second Screen ===> Printing user");
        System.out.println();
        System.out.println("===============================");
        System.out.println();
    }

}
