package com.example.demo.playground.what_is_interface.solution.charachters;

import com.example.demo.playground.what_is_interface.solution.capabilities.Flyable;
import com.example.demo.playground.what_is_interface.solution.capabilities.SoundMaker;
import com.example.demo.playground.what_is_interface.solution.capabilities.Swimable;
import com.example.demo.playground.what_is_interface.solution.capabilities.Walkable;

public class Duck implements SoundMaker, Flyable, Swimable, Walkable {

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Duck makes sound");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }

    @Override
    public void walk() {
        System.out.println("Duck walking");
    }
}
