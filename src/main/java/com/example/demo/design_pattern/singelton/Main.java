package com.example.demo.design_pattern.singelton;

import com.example.demo.design_pattern.singelton.screens.FirstScreen;
import com.example.demo.design_pattern.singelton.screens.SecondScreen;

public class Main {
    public static void main(String[] args) {
        UserSingleton.getInstance().name = "Ahmad";
        FirstScreen firstScreen = new FirstScreen();
        SecondScreen secondScreen = new SecondScreen();
    }

}
