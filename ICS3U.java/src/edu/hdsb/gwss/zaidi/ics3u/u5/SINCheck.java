
import java.util.Scanner;

public class SINCheck {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Print the output banner
		System.out.println("-----------------------------------------");
		System.out.println("NAME: Suggested Solution");
		System.out.println("STUDENT NUMBER: 1");
		System.out.println("COURSE: 74.101, SECTION: both");
		System.out.println("INSTRUCTOR: Bate, Laucht");
		System.out.println("ASSIGNMENT: 2, QUESTION: 2");
		System.out.println("-----------------------------------------");
		System.out.println(" ");

		//Read in the S.I.N. from the user
		System.out.print("Enter a 9-digit Social Insurance Number: ");
		int theSIN = input.nextInt();

		boolean evenDigit = false; //alternates between true and false
		int sum = 0; //accumulates the sum of the digits (as modified)

		while (theSIN > 0) {
			int nextDigit = theSIN % 10; //grab the last digit
			theSIN = theSIN / 10; //discard that digit
			if(evenDigit) {
				//double it, then add the two digits of the result
				nextDigit = 2*nextDigit;
				nextDigit = (nextDigit/10)+(nextDigit%10);
				} // if(evenDigit)
			sum = sum + nextDigit;
			evenDigit = !evenDigit; //toggle the flag each time
			} // end while

		if (0 == sum % 10)
			System.out.println("That is a valid S.I.N.");
		else
			System.out.println("That is not a valid S.I.N.");

		} // end main
	} // end class SINchecker

