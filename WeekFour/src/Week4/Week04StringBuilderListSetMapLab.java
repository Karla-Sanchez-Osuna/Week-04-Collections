package Week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {
	//
	// Copyright (c) 2023 Promineo Tech
	// Author:  Promineo Tech Academic Team
	// Subject:  StringBuilders, Lists, Sets, & Maps
	// Java Week 04 Lab

		public static void main(String[] args) {

			// 1. Why would we use a StringBuilder instead of a String?
				// Strings can not be change, StringBuilder allows changes
			// 		a. Instantiate a new StringBuilder
					StringBuilder sb = new StringBuilder();
			//		b. Append the characters 0 through 9 to it separated by dashes
			// 				Note:  make sure no dash appears at the end of the StringBuilder

//						sb.append('0');
//						sb.append('-');
//						sb.append('1');
//						sb.append('-');
//						sb.append('2');
//						sb.append('-');
//						sb.append('3');
//						sb.append('-');
//						sb.append('4');
//						sb.append('-');
//						sb.append('5');
//						sb.append('-');
//						sb.append('6');
//						sb.append('-');
//						sb.append('7');
//						sb.append('-');
//						sb.append('8');
//						sb.append('-');
//						sb.append('9');
//						System.out.println(sb.toString());
						for(int i = 0; i< 10; i++) {
							sb.append(i);
							if (i != 9) {
								sb.append("-");
							}
						}
						System.out.println(sb.toString());
			// 2. List of String:
			//		a. Create a list of Strings 
			//		b. Add 5 Strings to it, each with a different length
							List<String> str = new ArrayList<String>(); 
							str.add("Hello");
							str.add("Welcome");
							str.add("To");
							str.add("A Cold");
							str.add("Thrusday");
						//System.out.println(str);
							
						//	Arrays.asList("puppy, Me,food, toys");
							
							
			// 3. Write and test a method that takes a list of strings 
			//			and returns the shortest string
								//System.out.println(shortestString(str));
			
			// 4. Write and test a method that takes a list of strings 
			//			and returns the list with the first and last element switched

								List<String> swapped = FirstAndLast(str);
								for (String string : swapped) {
									System.out.println(str);
								}
			
			// 5. Write and test a method that takes a list of strings 
			//			and returns a string with all the list elements concatenated to each other,
			// 			separated by a comma
								System.out.println(combineStrings(swapped));
			
			// 6. Write and test a method that takes a list of strings and a string 
			//			and returns a new list with all strings from the original list
			// 			containing the second string parameter (i.e. like a search method)
								System.out.println("-----------------");
								List<String> searchResult = newList(str, "e");
								for(String result : searchResult) {
									System.out.println(result);
								}
			
			// 7. Write and test a method that takes a list of integers 
			//			and returns a List<List<Integer>> with the following conditions specified
			//			for the return value:
			//		a. The first List in the returned value contains any number from the input list 
			//			that is divisible by 2
			//		b. The second List contains values from the input list that are divisible by 3
			//		c. The third containing values divisible by 5, and 
			//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
								
								List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,15,20,25,30,36);
								
								List<List<Integer>>sortNumbers = sortDivisibleNumbers(numbers);
								
								for(List<Integer> list : sortNumbers) {
									for(Integer number : list) {
										System.out.println(number);
									}
									System.out.println("------------------");
								}
			
			// 8. Write and test a method that takes a list of strings 
			//			and returns a list of integers that contains the length of each string

								List<Integer> stringLengths = lengthOfString(str);
								for(Integer i :stringLengths) {
									System.out.println(i);
								}
			
			// 9. Create a set of strings and add 5 values
								Set<String>names = new HashSet<String>();
								names.add("Sam");
								names.add("Paul");
								names.add("Vanessa");
								names.add("Fred");
								names.add("Alex");
								names.add("Ally");
								
								
								System.out.println(names);
			
			
			// 10. Write and test a method that takes a set of strings and a character 
			//			and returns a set of strings consisting of all the strings in the
			// 			input set that start with the character parameter.
								Set<String>startWith = characterString(names, 'A');
								for(String name : startWith) {
									System.out.println(name);
								}

								System.out.println("--------------------");
			// 11. Write and test a method that takes a set of strings 
			//			and returns a list of the same strings
								List<String> resultList = setToList(names);
								for(String listString : resultList) {
									System.out.println(listString);
								}

								
								System.out.println("-----------------");
			// 12. Write and test a method that takes a set of integers 
			//			and returns a new set of integers containing only even numbers 
			//			from the original set
								Set<Integer>setOfNumbers = new HashSet<Integer>();
								setOfNumbers.add(1);
								setOfNumbers.add(2);
								setOfNumbers.add(3);
								setOfNumbers.add(4);
								setOfNumbers.add(5);
								setOfNumbers.add(6);
								setOfNumbers.add(57);
								setOfNumbers.add(88);
								setOfNumbers.add(7);
								setOfNumbers.add(60);
								setOfNumbers.add(45);
								setOfNumbers.add(8);
								setOfNumbers.add(9);
								setOfNumbers.add(10);
								
								Set<Integer>evenSet = evenNumbers(setOfNumbers);
								System.out.println(evenSet);
			
			// 13. Create a map of string and string and add 3 items to it where the key of each
			// 			is a word and the value is the definition of the word

							Map<String, String> dictionary = new HashMap<String, String>();
								
							dictionary.put("Code", "a system of words, letters, figures, or other symbols substituted for other words, letters, etc., especially for the purposes of secrecy.");
							dictionary.put("successful", "achieving or having achieved success");
							dictionary.put("stressful", "causing mental or emotional stress.");
								
			// 14. Write and test a method that takes a Map<String, String> and a string 
			// 			and returns the value for a key in the map that matches the
			// 			string parameter (i.e. like a language dictionary lookup)
							System.out.println(dictionayLookup(dictionary, "Code"));
							
			
			// 15. Write and test a method that takes a List<String> 
			//			and returns a Map<Character, Integer> containing a count of 
			//			all the strings that start with a given character
			
							Map<Character, Integer> counts = countAllStrings(resultList);
							for(Character character : counts.keySet()) {
								System.out.println(character + "--" + counts.get(character));
							}
		}
		
		
		// Method 15:
		public static Map<Character , Integer>countAllStrings(List<String>strings) {
			Map<Character , Integer> result = new HashMap<Character, Integer>();
			
			for (String string : strings) {
				char c = string.charAt(0);
				if(result.get(c) == null) {
					result.put(c, 1);
				} else {
					result.put(c, result.get(c) + 1);
				}
			}
			
			return result;
		}
		
		
		// Method 14:
		public static String dictionayLookup(Map<String, String> map, String word) {
			for(String key : map.keySet()) {
				if(key.equals(word)) {
					return map.get(key);
				}
			}
			return "";
		}

		
		// Method 12:
		public static Set<Integer>evenNumbers(Set<Integer>numbers) {
			Set<Integer>results = new HashSet<Integer>();
			for(Integer number : numbers) {
				if(number % 2 == 0) {
					results.add(number);
				}
				
			}
			return results;
		}

		
		// Method 11:
		public static List<String> setToList(Set<String>set) {
			List<String> results = new ArrayList<String>();
			
			for(String string : set) {
				results.add(string);
			}
			
			return results;
			
			
		}


		// Method 10:
		
		public static Set<String>characterString(Set<String>set, char c) {
			Set<String> result = new HashSet<String>();
			              
			for(String string : set) {
				if(string.charAt(0) == c) {
					result.add(string);
				}
			}
			
			return result;
			
		}

		
		// Method 8:
		
		public static List<Integer>lengthOfString(List<String>strings){
			List<Integer> result = new ArrayList<Integer>();
			for(String str : strings) {
				result.add(str.length());
			}
			return result;
		}
		
		// Method 7:
		
		public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list) {
			List<List<Integer>>results = new ArrayList<List<Integer>>();
			results.add(new ArrayList<Integer>());
			results.add(new ArrayList<Integer>());
			results.add(new ArrayList<Integer>());
			results.add(new ArrayList<Integer>());

			for(Integer number : list) {
				if (number % 2 == 0) {
					results.get(0).add(number);
				}
				if (number % 3 == 0) {
					results.get(1).add(number);
				}
				if (number % 5 == 0) {
					results.get(2).add(number);
				}
				if(number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
					results.get(3).add(number);
				}
			}
			return results;
		}
		
		// Method 6:
		
		public static List<String> newList(List<String> list, String str) {
			List<String> results = new ArrayList<String>();
			for(String string : list) {
				if (string.contains(str)) {
					results.add(string);
				}
			}
			return results;
			
		}
		
		// Method 5:
		
		public static String combineStrings(List<String>strings) {
			StringBuilder result = new StringBuilder();
			for (String string : strings) {
				result.append(string + " , ");
				
			}
			return result.toString();
		}
		
		// Method 4:
		
		public static List<String> FirstAndLast(List<String> list) {
		String temp = list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.set(list.size() - 1, temp);
		return list;
			
		}
		
		// Method 3:
		
		public static String shortestString (List<String> list) {
			String shortest = list.get(0);
			for(String string : list) {
				if (string.length() < shortest.length()) {
					shortest = string;
				}
			}
			return shortest;
			
		}
	}

