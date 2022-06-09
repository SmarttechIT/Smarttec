package com.usa;

public abstract class TestAnimal {
	
	public void getSalary() {
		
		double a=100.00;
		int b=90;
		int c = (a-b);
		System.out.println(c);	
	}
	
public static void getPassword() {
		
	System.out.println("I change my PW");		
	}
	
public int getMoney() {
	return 5000;

}

public String getUID() {
	return "sobhan123";
	
}
public void getProperty() {
	System.out.println("I change my Property");	
}

public static void main(String[] args) {
	TestAnimal.getPassword();
}

}
