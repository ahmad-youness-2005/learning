package com.example.demo.design_pattern.observer;

public class Receiver2 implements NewsObserver {

    @Override
    public void update(String news) {
        System.out.println("Receiver 2 received message ::" + news);
    }
}
