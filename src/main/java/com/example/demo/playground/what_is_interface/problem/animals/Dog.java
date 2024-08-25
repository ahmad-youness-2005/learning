package com.example.demo.playground.what_is_interface.problem.animals;

import com.example.demo.playground.what_is_interface.problem.Terrestrial;

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
