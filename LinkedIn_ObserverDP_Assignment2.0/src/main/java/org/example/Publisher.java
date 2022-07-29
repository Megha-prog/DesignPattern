package org.example;

import org.example.Services.Observer;
import org.example.Services.Subject;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void follow(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unFollow(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Post post) {
        for(Observer o:observers)
            o.update(post);
    }
}
