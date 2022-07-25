package com.demo.Builder;

public class RelianceStore {
    // order of arguments, data type of them, default value/don't want to set
    public static void main(String[] args) {
        
        PhoneBuilder builder = new PhoneBuilder().setOS("Android")
                .setProcessor("Snapdragon")
                .setCamera(12);
        
        
        Phone obj = builder.getPhoneDevice();
        System.out.println(obj);    
    }
}
