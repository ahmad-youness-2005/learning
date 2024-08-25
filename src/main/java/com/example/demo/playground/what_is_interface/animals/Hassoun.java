package com.example.demo.playground.what_is_interface.animals;

import com.example.demo.playground.what_is_interface.Bird;

public class Hassoun extends Bird {

    @Override
    public void fly() {
        System.out.println("Hassoun flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Hassoun making sound");
    }
}
