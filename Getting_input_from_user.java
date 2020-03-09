
// Getting input from user

import java.util.Scanner; // To use Scanner

public class Getting_input_from_user {

	public static void main(String[] args) {
		
		Scanner get = new Scanner(System.in); // Create Scanner object
		
		System.out.print("Enter name: ");
		String name = get.nextLine();
		
		System.out.print("Enter age: ");
		int age = get.nextInt();
		
		System.out.print("Enter height: ");
		float height = get.nextFloat();
		
		System.out.print("Enter weight: ");
		double weight = get.nextDouble();
		
		System.out.println("My name is " + name + " and I'm " + age + ". My height is " + height + " and weight is " + weight +".");
		
		get.close(); // Close the scanner object to avoid leakage of data.
	}
}

// OUTPUT

//Enter name: Praveen
//Enter age: 23
//Enter height: 6.2
//Enter weight: 80
//My name is Praveen and I'm 23. My height is 6.2 and weight is 80.0.
