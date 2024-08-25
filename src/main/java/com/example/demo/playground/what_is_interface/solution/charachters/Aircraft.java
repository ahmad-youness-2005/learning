package com.example.demo.playground.what_is_interface.solution.charachters;

import com.example.demo.playground.what_is_interface.solution.capabilities.Flyable;

public class Aircraft implements Flyable {
    @Override
    public void fly() {
        System.out.println("Aircraft flying");
    }
}
