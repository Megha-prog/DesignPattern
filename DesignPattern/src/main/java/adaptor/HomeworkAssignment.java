package adaptor;

public class HomeworkAssignment {
	
	 public static void main(String[] args) {
	        AssignmentWork work = new AssignmentWork();
	        
	        Pen pen = new PenAdapter();
	        
	        
	        work.setP(pen);
	        work.completeAssignment("Welcome to adapter deseign pattern");
	    }

}
