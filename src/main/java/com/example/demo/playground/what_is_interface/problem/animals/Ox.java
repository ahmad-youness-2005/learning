package com.example.demo.playground.what_is_interface.problem.animals;

import com.example.demo.playground.what_is_interface.problem.Terrestrial;

public class Ox extends Terrestrial {
    @Override
    public void makeSound() {
        System.out.println("Ox make sound");
    }

    @Override
    public void walk() {
        System.out.println("Ox is walking");
    }
}
