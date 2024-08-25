package com.example.demo.playground.what_is_interface;

import com.example.demo.playground.what_is_interface.animals.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        ArrayList<Terrestrial> terrestrials = new ArrayList<>();
        ArrayList<Fish> fishes = new ArrayList<>();
        ArrayList<Bird> birds = new ArrayList<>();

        terrestrials.add(new Dog());
        terrestrials.add(new Dog());
        terrestrials.add(new Lion());
        terrestrials.add(new Ox());

        fishes.add(new GoldFish());
        fishes.add(new Shark());
        fishes.add(new GoldFish());

        birds.add(new Hassoun());
        birds.add(new Hassoun());
        birds.add(new Eagle());

        animals.addAll(terrestrials);
        animals.addAll(fishes);
        animals.addAll(birds);

        for (Terrestrial terrestrial : terrestrials) {
            terrestrial.walk();
        }

        for (Fish fish : fishes) {
            fish.swim();
        }

        for (Bird bird : birds) {
            bird.fly();
        }

       for (Animal animal : animals) {
           animal.makeSound();
       }

    }

}
