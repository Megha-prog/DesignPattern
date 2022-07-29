//package org.example;
//
//import org.example.Services.Observer;
//import org.example.Services.Subject;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class PublisherF implements Subject {
//
//    List<Follower> followers = new ArrayList<>();
//
//    @Override
//    public void follow(Follower follower) {
//        followers.add(follower);
//    }
//
//    @Override
//    public void unFollow(Follower follower) {
//        followers.remove(follower);
//    }
//
//    @Override
//    public void notifyObserver(Post post) {
//        for(Follower follower:followers)
//            follower.update(post);
//    }
//}
