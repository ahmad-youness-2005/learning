package com.example.demo.playground.what_is_interface.solution;

import com.example.demo.playground.what_is_interface.solution.capabilities.Flyable;
import com.example.demo.playground.what_is_interface.solution.capabilities.SoundMaker;
import com.example.demo.playground.what_is_interface.solution.capabilities.Swimable;
import com.example.demo.playground.what_is_interface.solution.capabilities.Walkable;
import com.example.demo.playground.what_is_interface.solution.charachters.*;

public class Main {

    public static void main(String[] args) {
        GoldFish goldFish= new GoldFish();
        Lion lion = new Lion();
        Eagle eagle = new Eagle();
        Duck duck = new Duck();
        Worm worm = new Worm();
        Aircraft aircraft = new Aircraft();

        makeSoundCharacter(goldFish);
        makeSoundCharacter(lion);
        walkCharacter(lion);
        flyCharacter(eagle);

        makeSoundCharacter(duck);
        flyCharacter(duck);
        swimCharacter(duck);
        walkCharacter(duck);

        walkCharacter(worm);

        flyCharacter(aircraft);

        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Flyable anyway");
            }
        };
        flyCharacter(flyable);


//        Species species = new Species(5) {
//            @Override
//            public void eat() {
//                System.out.println("Eating...");
//            }
//
//            @Override
//            public void makeBabies() {
//                System.out.println("Making babies");
//            }
//
//            @Override
//            public void die() {
//                System.out.println("Die.");
//            }
//        };
//
//        species.eat();
//        species.die();
    }

    public static void flyCharacter(Flyable flyable){
        flyable.fly();
    }

    public static void swimCharacter(Swimable swimable){
        swimable.swim();
    }

    public static void walkCharacter(Walkable walkable){
        walkable.walk();
    }

    public static void makeSoundCharacter(SoundMaker soundMaker){
        soundMaker.makeSound();
    }

}
