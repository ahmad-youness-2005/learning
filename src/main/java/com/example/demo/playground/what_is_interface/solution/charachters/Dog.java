package com.example.demo.playground.what_is_interface.solution.charachters;

import com.example.demo.playground.what_is_interface.solution.capabilities.SoundMaker;
import com.example.demo.playground.what_is_interface.solution.capabilities.Walkable;

public class Dog implements Walkable, SoundMaker {

    @Override
    public void makeSound(){
        System.out.println("Dog is making sound");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

}
