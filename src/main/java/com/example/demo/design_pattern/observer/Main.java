package com.example.demo.design_pattern.observer;

public class Main {

    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();

        Receiver1 receiver1 = new Receiver1();
        Receiver2 receiver2 = new Receiver2();
        SilentReceiver silentReceiver = new SilentReceiver();

        newsPublisher.subscribe(receiver1);
        newsPublisher.subscribe(receiver2);
        newsPublisher.subscribe(silentReceiver);

        newsPublisher.subscribe(new NewsObserver() {
            @Override
            public void update(String news) {
                System.out.println("Unknown receiver: " + news);
            }
        });

        newsPublisher.publish("Article 1");
        newsPublisher.publish("Article 2");
        newsPublisher.publish("Article 3");
        newsPublisher.publish("Article 4");
        newsPublisher.publish("Article 5");
        newsPublisher.publish("Article 6");

        silentReceiver.printAllReceivedMessages();
    }

}
