package org.example;

public class Subscriber {

    private String name;
    private Channel channel;


    public Subscriber(String name) {
        super();
        this.name = name;
    }


    public void update() {
        System.out.println("Hi " + name + " Video is uploaded");
    }


    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }
}
