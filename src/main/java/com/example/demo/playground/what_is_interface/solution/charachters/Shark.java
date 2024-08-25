package com.example.demo.playground.what_is_interface.solution.charachters;

import com.example.demo.playground.what_is_interface.solution.capabilities.SoundMaker;
import com.example.demo.playground.what_is_interface.solution.capabilities.Swimable;

public class Shark implements Swimable, SoundMaker {
    @Override
    public void swim() {
        System.out.println("Shark swimming");
    }

    @Override
    public void makeSound() {
        System.out.println("Shark makeSound");
    }
}
