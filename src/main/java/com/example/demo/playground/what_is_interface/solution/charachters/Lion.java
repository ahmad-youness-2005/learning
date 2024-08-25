package com.example.demo.playground.what_is_interface.solution.charachters;

import com.example.demo.playground.what_is_interface.solution.capabilities.SoundMaker;
import com.example.demo.playground.what_is_interface.solution.capabilities.Walkable;

public class Lion implements Walkable, SoundMaker {

    public void makeSound(){
        System.out.println("Lion Sound");
    }

    @Override
    public void walk() {
        System.out.println("Lion is walking");
    }

}
