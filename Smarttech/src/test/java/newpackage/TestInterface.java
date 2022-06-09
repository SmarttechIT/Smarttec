package newpackage;

public class TestInterface implements MyInterface{

	
	@Override
	public void openBrowser() {
	
		System.out.println(" I want open my Browser");
	}

	@Override
	public void getUID() {
	
		System.out.println(" I want use my uid");
	}

	@Override
	public void getPW() {
		
		int a=20;
		int b=50;
		int c=a+b;
		
		
		System.out.println(c);
	}

	public void getSalary() {
		
		
	}
	
	
}
