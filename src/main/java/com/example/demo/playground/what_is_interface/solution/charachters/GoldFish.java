package com.example.demo.playground.what_is_interface.solution.charachters;

import com.example.demo.playground.what_is_interface.solution.capabilities.SoundMaker;
import com.example.demo.playground.what_is_interface.solution.capabilities.Swimable;

public class GoldFish  implements Swimable, SoundMaker {
    @Override
    public void makeSound() {
        System.out.println("Fish is making sound");
    }


    @Override
    public void swim() {
        System.out.println("GoldFish is swiming");
    }
}
