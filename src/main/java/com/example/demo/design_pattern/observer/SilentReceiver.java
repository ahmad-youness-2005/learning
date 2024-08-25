package com.example.demo.design_pattern.observer;

import java.util.ArrayList;

public class SilentReceiver implements NewsObserver {

    ArrayList<String> receivedMessages = new ArrayList<>();

    @Override
    public void update(String news) {
        receivedMessages.add(news);
    }

    public void printAllReceivedMessages(){
        for (String message : receivedMessages) {
            System.out.println("SilentReceiver :: " + message);
        }
    }
}
