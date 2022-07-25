package com.demo.Builder;

public class Phone {
	 private String os;
	    private double screenSize;
	    private int camera;
	    private int battery;
	    private String processor;
	    
	    public Phone(String os, double screenSize, int camera, int battery, String processor) {
	        super();
	        this.os = os;
	        this.screenSize = screenSize;
	        this.camera = camera;
	        this.battery = battery;
	        this.processor = processor;
	    }

	    @Override
	    public String toString() {
	        return "Phone [os=" + os + ", screenSize=" + screenSize + ", camera=" + camera + ", battery=" + battery
	                + ", processor=" + processor + "]";
	    }

}
