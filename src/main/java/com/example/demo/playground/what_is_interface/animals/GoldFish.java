package com.example.demo.playground.what_is_interface.animals;

import com.example.demo.playground.what_is_interface.Fish;

public class GoldFish extends Fish {
    @Override
    public void makeSound() {
        System.out.println("Fish is making sound");
    }


    @Override
    public void swim() {
        System.out.println("GoldFish is swiming");
    }
}
