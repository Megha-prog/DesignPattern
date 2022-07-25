package com.demo.Factory;

public class ChromStore {
	 public static void main(String[] args) {
	OperatingSystemFactory factory = new OperatingSystemFactory();
    OperatingSystem obj = factory.getInstance("ClosedSource");
    
    obj.config();
}

}
