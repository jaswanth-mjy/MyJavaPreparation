package AccentureCoding;

import java.util.*;

public class Cal {

	// Main driver method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		String dayString;

		int day;
		// Switch statement with int data type
		switch (day) {

			// Case
			case 1:
				dayString = "Monday";
				break;

			// Case
			case 2:
				dayString = "Tuesday";
				break;

			// Case
			case 3:
				dayString = "Wednesday";
				break;

			// Case
			case 4:
				dayString = "Thursday";
				break;

			// Case
			case 5:
				dayString = "Friday";
				break;

			// Case
			case 6:
				dayString = "Saturday";
				break;

			// Case
			case 7:
				dayString = "Sunday";
				break;

			// Default case
			default:
				dayString = "Invalid day";
		}
		System.out.println(dayString);
	}
}
