package com.usa;

import java.util.Arrays;

public class LoopingArray {
	   //    0   1  2  3
	int[]a= {10,40,79,0};
	
	public void loopArray() {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[3]);
			
		}
		
	}

	public static void main(String[] args) {
		
		LoopingArray obj = new LoopingArray();
		obj.loopArray();
	}
	
}
