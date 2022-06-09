package newpackage;
// Non Abstract class/Concrete class 
public class TestAnimal {
	
	public static void main(String[] args) {
		
		Animal.myCat();
		TestAnimal.getProperty();
		TestAnimal object = new TestAnimal();
		object.getSalary();
		
		Animal obj = new Animal(); 
		obj.getDog();
		obj.getCow();
		obj.getMoney();
		obj.getPassword();
		System.out.println(obj.getMoney());
		System.out.println(obj.getPassword());
		
	}

	public void getSalary() {
		
		System.out.println("I need my Salary");
	}
	
public static void getProperty() {
		
		System.out.println("I need my Property");
		
	}
	

}
