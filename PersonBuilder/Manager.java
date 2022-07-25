package PersonBuilder;



public class Manager {
	
	 public static void main(String[] args) {
	        
	        PersonBuilder builder = new PersonBuilder().setDepartment("Java")
	                .setName("megha");
	                	        
	        
	        Person obj = builder.getPerson();
	        System.out.println(obj);    
	    }

}
