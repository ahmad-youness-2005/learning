package com.example.demo.playground.what_is_interface.solution.charachters;

import com.example.demo.playground.what_is_interface.solution.capabilities.Flyable;
import com.example.demo.playground.what_is_interface.solution.capabilities.SoundMaker;

public class Hassoun  implements Flyable, SoundMaker {

    @Override
    public void fly() {
        System.out.println("Hassoun flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Hassoun making sound");
    }
}
