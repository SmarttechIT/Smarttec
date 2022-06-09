package constructor;

public class ParameterConstructor {
	
	String stName;
	int stRoll;
	
	public ParameterConstructor(String StudentName, int Rollnum) {
		
		stName = StudentName;
		stRoll = Rollnum;
		
	}
	
	public static void main(String[] args) {
		ParameterConstructor obj = new ParameterConstructor("Sobhan", 100);
		System.out.println(obj.stName);
		System.out.println(obj.stRoll);
		
	}

}
