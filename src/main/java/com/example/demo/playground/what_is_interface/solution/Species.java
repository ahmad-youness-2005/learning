package com.example.demo.playground.what_is_interface.solution;

public abstract class Species {
    private int age = 0;

    public Species(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
    public abstract void makeBabies();
    public abstract void die();
}
