package polymor;
//This is child class
public class ChildOverride extends ParentOverride {
	
	public static void main(String[] args) {
		
		ChildOverride obj = new ChildOverride();
		obj.getHomeLoan();
		obj.getStudentLoan();
		
		System.out.println(obj.getHomeLoan());
		System.out.println(obj.getStudentLoan());
		
	}

	public  double getHomeLoan() {
		return 11.5;
		
	}
	public  double getStudentLoan() {
		return 3.5;
		
	}
	
	
}
