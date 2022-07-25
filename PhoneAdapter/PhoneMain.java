package PhoneAdapter;



public class PhoneMain {
	

	public static void main(String[] args) {
		 
		 
		 Work work = new Work();
		 
		 
		 
		 Android android = new AndroidAdaptor();
		 
		 	work.setAndroid(android);
		 
		    work.doCharge("Phone started charging");
	     
	 
	 }

}
