package org.example.Observer;

import org.example.Subscriber;

public interface Subject {
    void follow(Followers follower);
    void notifyFollowers(String sachin_tengular_has_tweeted);
}
