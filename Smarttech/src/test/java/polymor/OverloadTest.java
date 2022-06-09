package polymor;

public class OverloadTest {

	public static void main(String[] args) {
		
		Overload obj = new Overload(); 
		
		obj.getSum(50);
		obj.getSum(50, 100);
		obj.getSum(50, 80, 90);
		obj.getSum(70, 80, 90, 100);
	}
	
}
