package polymor;

//In the same class, multiple method but method name should be same,Only change the parameter 


public class Overload {
	
	public void getSum(int a) {
		
		System.out.println(a);
		
	}
	
public void getSum(int a, int b) {
		
	System.out.println(a-b);
	}
	
public void getSum(int a, int b, int c) {
	
	System.out.println(a*b*c);
	
}
public void getSum(int a, int b, int c, int d) {
	System.out.println(a+b+c+d);
	
}	




}
