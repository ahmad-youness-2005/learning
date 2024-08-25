package com.example.demo.playground.what_is_interface.problem.animals;

import com.example.demo.playground.what_is_interface.problem.Terrestrial;

public class Lion extends Terrestrial {

    public void makeSound(){
        System.out.println("Lion Sound");
    }

    @Override
    public void walk() {
        System.out.println("Lion is walking");
    }

}
