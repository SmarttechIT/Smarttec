package com.usa;

import java.util.Arrays;

// old Array
public class TestArray {
	
	int[] a= new int[6];
	
	public void getArray() {
		a[0]=59;
		a[1]=100;
		a[2]=59;
		a[3]=589;
		a[4]=509;
		a[5]=59;
		
	
	System.out.println(Arrays.toString(a));
	
	}	
	
	public static void main(String[] args) {
		TestArray obj = new TestArray();
		obj.getArray();
		
	}

}
