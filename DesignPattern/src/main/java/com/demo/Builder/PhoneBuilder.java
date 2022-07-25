package com.demo.Builder;

public class PhoneBuilder {
	private String os;
	private double screenSize;
	private int camera;
	private int battery;
	private String processor;
	
	
	
	
	public PhoneBuilder setOS(String os) {
        this.os = os;
        return this;
    }
	
	
	
	PhoneBuilder setCamera(int camera) {
		this.camera= camera;
		return this;
	}
	
	PhoneBuilder setProcessor(String processor) {
		this.processor=processor;
		return this;
	}
	
	 public Phone getPhoneDevice() {
	        return new Phone(os, screenSize, camera, battery, processor);
	    }
}
