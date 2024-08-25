package com.example.demo.playground.what_is_interface.animals;

import com.example.demo.playground.what_is_interface.Fish;

public class Shark extends Fish {
    @Override
    public void swim() {
        System.out.println("Shark swimming");
    }

    @Override
    public void makeSound() {
        System.out.println("Shark makeSound");
    }
}
