package Singletone;

public class Singleton {
	private static Singleton object;
	//create private construtor
	//common use cases-->database connect and threads
	private Singleton() {
		
	}
	//create static method
	
	public static Singleton getInstance() {
		if(object==null) {
			object= new Singleton();
			
		}
		return object;
		
	}
	public static void main(String[] args) {
        Singleton obj = new Singleton();
        System.out.println(obj.getInstance());
        
        Singleton obj1 = new Singleton();
        System.out.println(obj1.getInstance());

    }

}
