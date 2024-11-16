package Week4;

public class StringBuilderExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName = "Bob";
		String lastName = "Brown";
		String middleInitial = "B";
		String space = " ";

		System.out.println(firstName);
		System.out.println(lastName);

		StringBuilder sb = new StringBuilder();

		// use append() to dynamically create a String using StringBuilde
		sb.append(firstName);
		sb.append(space);
		sb.append(lastName);
		System.out.println(sb.toString());
		
		// Add a middle Initial
		sb.insert(firstName.length()+1, middleInitial + space);
		System.out.println(sb.toString());
		
		//  reverse a variable of type StringBuilder
		
		
		String fullName = "Bob B Brown";
		String result = "";
		
		for(int i = fullName.length()-1;i >= 0; i--) {
			result = result + fullName.charAt(i);
		}
		
		System.out.println(result);
		
		
		
	}

}
