package com.example.demo.design_pattern.observer;

public class Receiver3 implements NewsObserver {

    @Override
    public void update(String news) {
        System.out.println("Receiver 3 received message ::" + news);
    }
}
