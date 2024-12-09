package week4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Create an Array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
				int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
				for(int age : ages) {
					//System.out.println(age);
				}
			
		//a. Programmatically subtract the value of the first element in the Array from the value in the last element of the Array (i.e. do not use ages[7] in your code). Print the result to the console.
		
				if(ages.length > 0) {
					int result = ages[ages.length-1] - ages[0];
					System.out.println(result);
				}
				
		//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements). 
					int[]ages2 = {20,45,5,17,6,28,33,57,32,};				
					
		// 		i. Make sure that there are 9 elements of type int in this new array. 
		
		
		// 		ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2).
						int total= ages2[ages2.length-1]- ages2[0];
						System.out.println(total);
		//		iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
						int[]ages02 = {20,45,5,17,6,28,33};
						
						int total2= ages02[ages02.length-1]- ages02[0];
				
						
	//c. Use a loop to iterate through the Array and calculate the average age. Print the result to the console. 
						int sum = 0;
						for(int age : ages2) {
							
							sum+= age;
						}
						double avarage = sum/ages2.length;
						System.out.println(avarage); 
						
						System.out.println("----------------------");
						
 // 2.Create an Array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.		
			 	 
 // a. Use a loop to iterate through the Array and calculate the average number of letters per name. Print the result to the console. 
			
// b. Use a loop to iterate through the Array again and concatenate all the names together, separated by spaces, and print the result to the console. 				 
			 String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			 double count= 0;
			 
			 for(String name : names) {
				 count += name.length();
				
			 }
			 	double avarageLetters = count/names.length;
			 	System.out.println("avarage is: " + avarageLetters );
			 	
			 	String result = "";
			 	
			 		for(int i = 0; i< names.length; i++) {
			 			result += names[i];
			 			if(i<names.length) {
			 				result += " ";
			 			}
			 		}
			 		System.out.println(result);
 // 3. How do you access the last element of any Array?
	
	// To access the last element in an array you would do array.length - 1 inside the braces of the array.
			 
 // 4. How do you access the first element of any Array?
			 		
		// The first element of an array is always at index 0, so you would do Array[0};
						   
						   
 //  5. Create a new Array of int called nameLengths. Write a loop to iterate over the previously created names Array and add the length of each name to the nameLengths Array. 
				int[]nameLengths = new int [names.length];
				
				for(int i = 0; i < names.length; i++) {
					
						 nameLengths[i] = names[i].length();
				}
				System.out.println(Arrays.toString(nameLengths));

//   6. Write a loop to iterate over the nameLengths Array and calculate the sum of all the elements in the Array. Print the result to the console. 			 *   
						 
				sum= 0;
				
				for(int lengths : nameLengths) {
						sum+= lengths;
				}
				System.out.println(sum);
//  7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”). 
		System.out.println(wordNumberOfTimes("Hello", 3));				 
	   
//  8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
						System.out.println(fullName("Karla","Sanchez"));
						    
//	 9. Write a method that takes an Array of int and returns true if the sum of all the ints in the Array is greater than 100. 
						 int[] numbers = {20,40,15,20,10};
						    
						 System.out.println(greaterThan100(numbers));
//    10. Write a method that takes an Array of double and returns the average of all the elements in the Array. 
						
						 double [] digits = {25, 40, 60, 2, 10};
						 
						 System.out.println(average(digits));
						    
//    11. Write a method that takes two Arrays of double and returns true if the average of the elements in the first Array is greater than the average of the elements in the second Array. 
						 double []array1 = {20, 3, 15, 18,25, 32};
						 double []array2 = { 16, 7, 9, 11, 85, 54};
						 System.out.println(whichAverageIsGreater(array1, array2));
						 System.out.println("---------------------");
//    12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50. 
						 
						  boolean isHot = true;
						  double moneyInPocket = 20.50;
						  System.out.println(willBuyDrink(isHot, moneyInPocket));
						 System.out.println("---------------");
//   13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it. 
						
						 List<String> books = new ArrayList<>();
						 books.add("A Day of Fallen Night (The Roots of Chaos)");
						 books.add("Daughter of the Moon Goddess (The Celestial Kingdom Duology, #1)");
						 books.add("Apprentice to the Villain (Assistant and the Villain, 2)");
						 books.add("One Dark Window (The Shepherd King, 1)");
						 books.add("Mistress of All Evil (Villains, Book 4): A Tale of the Dark Fairy (Villains, 4)");
						 books.add("Assistant to the Villain");
						 books.add("The Half King (Deluxe Limited Edition");
						 books.add("The Games Gods Play (Deluxe Limited Edition)");
						 books.add("Moby-Dick");
					
						List<String>startWith = searchForAWord(books, "king");
							for(String word : startWith) {
								System.out.println(word);
								
							}
						  
						  
						  
	} // end of main
	
//  7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”). 

	
	public static String wordNumberOfTimes(String word, int n) {
		
		String result= "";
		
		for(int i = 0; i < n; i++) {
			result+= word;
		}
		return result;
	} // end of wordNumberOfTimes
	
//  8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	
	public static String fullName(String firstName, String lastName) {
		return  firstName + " " + lastName;
			
	}
    
//	 9. Write a method that takes an Array of int and returns true if the sum of all the ints in the Array is greater than 100. 
			
			public static boolean greaterThan100(int[]numbers) {
			int	sum = 0;
				for(int number : numbers) {
					sum += number;
					
		
				}
				if(sum > 100) {
					return true;
				} else {
					return false;
				}

			}
			
						    
						 
//    10. Write a method that takes an Array of double and returns the average of all the elements in the Array. 
						public static double average(double[]numbers) {
							double sum = 0;
							
							for(double number : numbers) {
								sum+= number;
							}
							double avarage = sum/numbers.length;
							return avarage;
					
						} // end of average
						    
//    11. Write a method that takes two Arrays of double and returns true if the average of the elements in the first Array is greater than the average of the elements in the second Array. 
						 
			    public static boolean whichAverageIsGreater(double[] array1, double[] array2) {
			    	
			    	double average1 = average(array1);
			    	double average2 = average(array2);
			    	
			    	if(average1 > average2) {
			    		return true;
			    	} else {
			    		return false;
			    	}
			    	
			    } //end of whichAverageIsGreater
						
//    12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50. 
			public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) 	{
					if(isHotOutside && (moneyInPocket > 10.50)) {
						return true;
					} else {
						return false;
					}
				
				
			}
						  
						 
//   13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it. 
						
			public static List<String> searchForAWord(List<String>list, String word) {
				List<String> result = new ArrayList<>();
				for(String string : list) {
					if(string.toLowerCase().contains(word)) {
						result.add(string);
					} 
				}
					return result;					
					
				
				}
				
			
			
} // end of class
