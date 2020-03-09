
// Do While loop

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        /*
        System.out.println("Enter a number: ");
        int value = scan.nextInt();
        
        while(value != 5) {
            System.out.println("Enter a number: ");
            value = scan.nextInt();
        }
        */
        
        int value = 0;
        
        do {
            System.out.print("Enter a number: ");
            value = scan.nextInt();
        }
        
        while(value != 5);
        
        System.out.println("Got 5!");

	}

}

// OUTPUT

//Enter a number: 3
//Enter a number: 6
//Enter a number: 7
//Enter a number: 5
//Got 5!
