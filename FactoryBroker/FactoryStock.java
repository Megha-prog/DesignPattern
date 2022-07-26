package FactoryBroker;



public class FactoryStock {
	public Stock getInstance(String stockCountry) {
		
		if(stockCountry.equals("US")) {
            return new StockUS();
        } else if(stockCountry.equals("Germany")) {
            return new StockGermany();
        } else {
            return new StockIndia(); // default one
        
    }
		
	}
}
