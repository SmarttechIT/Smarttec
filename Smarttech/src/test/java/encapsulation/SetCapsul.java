package encapsulation;

public class SetCapsul {
	
	public static void main(String[] args) {
		
		Encapsul obj = new Encapsul();
		obj.getA();
		obj.getB();
		obj.getC();
		
		obj.setA(50);
		obj.setB(100);
		obj.setC(200);
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		System.out.println(obj.getC());
		
	}

}
