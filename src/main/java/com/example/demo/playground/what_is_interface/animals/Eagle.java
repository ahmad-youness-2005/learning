package com.example.demo.playground.what_is_interface.animals;

import com.example.demo.playground.what_is_interface.Bird;

public class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle making sound");
    }
}
