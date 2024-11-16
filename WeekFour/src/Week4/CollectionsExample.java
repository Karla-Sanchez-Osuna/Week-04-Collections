package Week4;

import java.util.HashSet;
import java.util.Set;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Set Example:
		
		Set<String>vegetables = new HashSet<String>();
		vegetables.add("Carrot");
		System.out.println(vegetables);
		
		// Allows one  null 
		
		vegetables.add(null);
		System.out.println(vegetables);
		

		vegetables.add(null);
		System.out.println(vegetables);
		
		vegetables.add("Onion");
		System.out.println(vegetables);
		
		vegetables.add("Broccoli");
		System.out.println(vegetables);
		
		vegetables.add("Asparagus");
		System.out.println(vegetables);
		
		vegetables.add("Asparagus");
		System.out.println(vegetables);
		

System.out.println("The size of our set is: " + vegetables.size());
	}

}
