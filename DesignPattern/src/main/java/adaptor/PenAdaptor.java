package adaptor;

import external.BallPen;

public class PenAdaptor {
	  BallPen ballPen = new BallPen();
	    
	    public void write(String data) {
	        
	        ballPen.mark(data);
	    }


}
