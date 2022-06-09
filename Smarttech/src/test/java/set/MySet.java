package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
	
	public static void main(String[] args) {
		// HashSet does not allow any duplicate but its allow one Null 
		Set<String> mySet = new HashSet<>();
		mySet.add("Sobhan");
		mySet.add("Azad");
		mySet.add("Sobhan");
		mySet.add("Biki");
		mySet.add(null);
		mySet.add(null);
		mySet.add("USA");
		
		System.out.println(mySet);
	
	Set<Integer> myNewset= new TreeSet<Integer>();
// TreeSet does not allow any null,duplicate and follow ascending order 
   // myNewset.add(null);
    myNewset.add(900);
    myNewset.add(200);
    myNewset.add(200);
    myNewset.add(500);
    myNewset.add(2000);
    myNewset.add(1200);
    
    System.out.println(myNewset);
 // LinkHashSet allow one null no duplicate and follow inserting order 
    Set<Integer> linkSet= new LinkedHashSet<Integer>();
    linkSet.add(null);
    linkSet.add(null);
    linkSet.add(30);
    linkSet.add(30);
    linkSet.add(10);
    linkSet.add(100);
    linkSet.add(200);
    System.out.println(linkSet);
    
	}	
}	
	

