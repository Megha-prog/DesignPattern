package org.example;

import org.example.Services.Observer;

public class Follower implements Observer {
    @Override
    public void update(Post post) {
        System.out.println("New Post:-\t"+post.getPost());
    }
}
