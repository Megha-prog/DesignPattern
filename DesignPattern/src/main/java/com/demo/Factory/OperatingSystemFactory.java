package com.demo.Factory;


public class OperatingSystemFactory {
	
	public OperatingSystem getInstance(String osType) {
 

        // can be replaced by switch statement
        
        if(osType.equals("OpenSource")) {
            return new Andriod();
        } else if(osType.equals("ClosedSource")) {
            return new IOS();
        } else {
            return new Windows(); // default one
        
    }

}
}