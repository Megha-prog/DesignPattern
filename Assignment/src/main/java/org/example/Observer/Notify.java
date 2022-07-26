package org.example.Observer;


import org.example.Subscriber;

public class Notify {
    public static void main(String[] args) {

        User ttuser = new User();
        initialiseFollwers(ttuser);

        ttuser.upload("Welcome to Twitter ");

    }

    private static void initialiseFollwers(User ttuser) {
        Followers f1= new Followers("Megha");
        Followers f2= new Followers("Kavya");
        Followers f3 = new Followers("Nishu");
        Followers f4= new Followers("Ankur");
        Followers f5= new Followers("Darshan");
        ttuser.setFollower(f1);
        ttuser.setFollower(f2);
        ttuser.setFollower(f3);
        ttuser.setFollower(f4);
        ttuser.setFollower(f5);

        f1.followUser(ttuser);
        f2.followUser(ttuser);
        f3.followUser(ttuser);
        f4.followUser(ttuser);
        f5.followUser(ttuser);


    }


}




