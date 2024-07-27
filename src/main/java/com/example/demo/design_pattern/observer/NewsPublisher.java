package com.example.demo.design_pattern.observer;

import java.util.ArrayList;

public class NewsPublisher {

    private ArrayList<NewsObserver> newsObservers = new ArrayList<>();

    public void subscribe(NewsObserver newsObserver) {
        newsObservers.add(newsObserver);
    }

    public void unsubscribe(NewsObserver newsObserver) {
        newsObservers.remove(newsObserver);
    }

    public void publish(String message) {
        for (NewsObserver newsObserver : newsObservers) {
            newsObserver.update(message);
        }
    }

}
