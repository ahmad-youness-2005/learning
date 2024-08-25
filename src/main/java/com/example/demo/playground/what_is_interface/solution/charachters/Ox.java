package com.example.demo.playground.what_is_interface.solution.charachters;

import com.example.demo.playground.what_is_interface.solution.capabilities.SoundMaker;
import com.example.demo.playground.what_is_interface.solution.capabilities.Walkable;

public class Ox implements Walkable, SoundMaker {
    @Override
    public void makeSound() {
        System.out.println("Ox make sound");
    }

    @Override
    public void walk() {
        System.out.println("Ox is walking");
    }
}
