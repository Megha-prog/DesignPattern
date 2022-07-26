package org.example;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{


    private String title;
    List<Subscriber> subscriberList = new ArrayList<>();
    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);


    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for(Subscriber subs: subscriberList) {
            subs.update();
        }

    }

    void upload(String title) {
        this.title = title;
        this.notifySubscriber();
    }
}
