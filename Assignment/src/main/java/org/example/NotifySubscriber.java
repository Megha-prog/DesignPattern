package org.example;

public class NotifySubscriber {
    public static void main(String[] args) {

        Channel ytchannel = new Channel();
        initialiseSubscriber(ytchannel);

        ytchannel.upload("Welcome to Youtube ");

    }


    private static void initialiseSubscriber(Channel ytchannel) {


        Subscriber sub1 = new Subscriber("Nitesh");
        Subscriber sub2 = new Subscriber("Nkdebug");
        Subscriber sub3 = new Subscriber("Rishav");
        Subscriber sub4 = new Subscriber("Ankur");
        Subscriber sub5 = new Subscriber("Megha");
        Subscriber sub6 = new Subscriber("Nishu");

        ytchannel.subscribe(sub1);
        ytchannel.subscribe(sub2);
        ytchannel.subscribe(sub3);
        ytchannel.subscribe(sub4);
        ytchannel.subscribe(sub5);
        ytchannel.subscribe(sub6);


        sub1.subscribeChannel(ytchannel);
        sub2.subscribeChannel(ytchannel);
        sub3.subscribeChannel(ytchannel);
        sub4.subscribeChannel(ytchannel);
        sub5.subscribeChannel(ytchannel);
        sub6.subscribeChannel(ytchannel);

    }
}
