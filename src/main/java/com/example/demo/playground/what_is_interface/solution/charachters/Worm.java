package com.example.demo.playground.what_is_interface.solution.charachters;

import com.example.demo.playground.what_is_interface.solution.capabilities.Walkable;

public class Worm implements Walkable {
    @Override
    public void walk() {
        System.out.println("Worm");
    }
}
