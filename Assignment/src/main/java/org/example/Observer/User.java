package org.example.Observer;


import java.util.ArrayList;
import java.util.List;

public class User implements Subject{

    private String tweetTitle;

    List<Followers> followersList = new ArrayList<>();
    public void setFollower(Followers follower) {
        followersList.add(follower);


    }

    @Override
    public void follow(Followers follower) {

    }

    public void notifyFollowers(String sachin_tengular_has_tweeted) {
        for (Followers subs : followersList) {
            subs.update();
        }

    }

    void upload(String tweetTitle) {
        this.tweetTitle = tweetTitle;
        this.notifyFollowers("Sachin Tengular has tweeted");
    }
}