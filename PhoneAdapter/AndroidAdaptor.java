package PhoneAdapter;

import externl.Ios;

public class AndroidAdaptor implements Android{
	
	Ios ios = new Ios();
	public void charge (String msg) {
		ios.charge(msg);
	}
	

}
