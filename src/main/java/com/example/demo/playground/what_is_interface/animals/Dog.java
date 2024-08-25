package com.example.demo.playground.what_is_interface.animals;

import com.example.demo.playground.what_is_interface.Terrestrial;

public class Dog extends Terrestrial {

    @Override
    public void makeSound(){
        System.out.println("Dog is making sound");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

}
