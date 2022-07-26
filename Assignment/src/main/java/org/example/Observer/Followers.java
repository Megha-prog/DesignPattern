package org.example.Observer;

import org.example.Channel;

public class Followers {

    private String name;
    private User user;
    private Followers followers;

    public Followers(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Hi   " + name + " Sachin has done Tweet ");
    }
    public void followUser(User user) {
        this.user = user;
    }
}
