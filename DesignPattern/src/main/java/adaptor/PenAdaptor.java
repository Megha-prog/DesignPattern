package adaptor;

import external.BallPen;

public class PenAdapter {
	  BallPen ballPen = new BallPen();
	    
	    public void write(String data) {
	        
	        ballPen.mark(data);
	    }


}
