package com.example.demo.design_pattern.observer;

public class Receiver1 implements NewsObserver {

    @Override
    public void update(String news) {
        System.out.println("Receiver 1 received message ::" + news);
    }
}
