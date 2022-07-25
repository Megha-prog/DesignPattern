package adaptor;

public class AssignmentWork {
	 private Pen p;
	    
	    public Pen getP() {
	        return p;
	    }


	    public void setP(Pen p) {
	        this.p = p;
	    }


	    public void completeAssignment(String data) {
	        p.write(data);
	    }
}
