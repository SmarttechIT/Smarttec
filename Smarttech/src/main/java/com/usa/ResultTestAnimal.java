package com.usa;

public class ResultTestAnimal extends TestAnimal{

	public static void main(String[] args) {
	
		ResultTestAnimal obj = new ResultTestAnimal();
		obj.getProperty();
		obj.getMoney();
		obj.getUID();
		obj.getSalary();
		System.out.println(obj.getMoney());
		System.out.println(obj.getUID());
		TestAnimal.getPassword();
	}
	
public abstract void getSalary(); 
	
}
