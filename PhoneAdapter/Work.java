package PhoneAdapter;



	public class Work {
	 private Android android;
	
	
	

	public Android getAndroid() {
		return android;
	}




	public void setAndroid(Android android) {
		this.android = android;
	}




	public void doCharge(String data) {
	     android.charge(data);
	}








}
