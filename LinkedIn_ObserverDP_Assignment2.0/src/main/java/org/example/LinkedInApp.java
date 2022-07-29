package org.example;

public class LinkedInApp {

    public static void main(String[] args) {

        Publisher publisher = new Publisher();
        Follower follower1 = new Follower();

        publisher.follow(follower1);    //initializing followers to the publisher

        for (int i = 0; i < 3; i++) {
            publisher.follow(new Follower());   // populating followers
        }

        Post post = new Post("This is the second example of observer design pattern."); //creating a post or message to publish

        publisher.notifyObserver(post);     //send notifications to the observers i.e. followers

//        publisher.unFollow(follower1);
//        publisher.notifyObserver(new Post("Hey there..!")); //after unfollowing the post won't get to the follower as we have removed them
    }
}