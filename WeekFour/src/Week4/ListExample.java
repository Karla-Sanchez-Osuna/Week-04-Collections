package Week4;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example declaring an Array of Strings:
		
		String[] myInstruments = new String[4];
		myInstruments[0] = "Tuba";
		myInstruments[1] = "Trombone";
		myInstruments[2] = "Trumpet";
		myInstruments[3] = "Triangle";
		
//		Another way to create this same array would be as follows:
//			String[] myInstruments = {"Tuba", "Trombone", "Trumpet", "Triangle"};

		// Example declaring a List of String:

		List<String> myInstruments = new ArrayList<String>();
		myInstruments.add("Tuba");
		myInstruments.add("Trombone");
		myInstruments.add("Trumpet");
		myInstruments.add("Triangle");
		myInstruments.add("Flute");
		myInstruments.add("Clarinet");
		myInstruments.add("Oboe");
		
		 
		
	}

}
