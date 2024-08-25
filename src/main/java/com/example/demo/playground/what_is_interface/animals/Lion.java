package com.example.demo.playground.what_is_interface.animals;

import com.example.demo.playground.what_is_interface.Terrestrial;

public class Lion extends Terrestrial {

    public void makeSound(){
        System.out.println("Lion Sound");
    }

    @Override
    public void walk() {
        System.out.println("Lion is walking");
    }

}
