package org.example.Services;

import org.example.Post;

public interface Subject {
    void follow(Observer observer);
    void unFollow(Observer observer);
    void notifyObserver(Post post);

}
