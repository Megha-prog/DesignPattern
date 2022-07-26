package FactoryBroker;



public class FactoryMain {
	public static void main(String[] args) {
	
	    FactoryStock stock = new FactoryStock();
		Stock obj =stock.getInstance("Germany");
	    
	    obj.buy();
	}

}
