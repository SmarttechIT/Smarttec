package constructor;

// Constructor is a special type of method in Java.  Constructor name should be same a class name 
// Should not be a return type or void method. It does not return any value 
//  Constructor created automatically when we create an object in that class. 

public class TestConstructor {
	
	
	 TestConstructor() {
		System.out.println("I am a special type of method");
		
	}
	
	
	 
	 public void getSalary() {
		 
		 System.out.println("I need my Salary");
	 }
	
	  public static void main(String[] args) { 
		  TestConstructor obj = new TestConstructor();
		  obj.getSalary();
	  
	  
	  
	  }
	 

}
