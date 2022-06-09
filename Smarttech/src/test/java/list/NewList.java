package list;

import java.util.ArrayList;
import java.util.List;

public class NewList {
	
	public static void main(String[] args) {
	//Interface<datatype>  obj        Class
		List<String> myGrocery = new ArrayList<String>();
		myGrocery.add("Salt");
		myGrocery.add("Salt");
		myGrocery.add("Salt");
		myGrocery.add("Sugar");
		myGrocery.add("Milk");
		myGrocery.add("Salt");
		myGrocery.add("Rice");
		myGrocery.add("Meat");
		myGrocery.add("Egg");
		myGrocery.add(null);
		myGrocery.add(null);
		myGrocery.add(null);
		myGrocery.add(null);
		
		System.out.println(myGrocery);
		
		
	}

}
