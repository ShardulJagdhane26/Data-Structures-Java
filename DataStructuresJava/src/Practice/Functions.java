package Practice;

import java.util.Scanner;

public class Functions {

	Scanner sc = new Scanner(System.in);

	void EvenSqOddCu() {
		System.out.println("Square of odd numbers and cube of even numbers : ");
		for (int i = 1; i <= 10; i++) {
			if ((i % 2) != 0) {
				System.out.print("The square of " + i + " : ");
				System.out.print(Math.pow(i, 2) + " ");
				System.out.println();
			} else {
				System.out.print("The cube of " + i + " : ");
				System.out.print(Math.pow(i, 3) + " ");
				System.out.println();
			}
		}
	}

	void PrintSqPattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	void PrintIncOrdLTR() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	void PrintIncOrdRTL() {
	    for (int i = 1; i < 6; i++) {
	        for (int j = 0; j < 6 - i; j++) {
	            System.out.print("  ");
	        }
	        for (int k = 0; k < i; k++) {
	            System.out.print("* ");
	        }
	        if (i < 5) { // Avoid printing an extra newline on the last iteration
	            System.out.println();
	        }
	    }
	}

	
	void PrintDecOrdRTL() {
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void PrintDecOrdLTR() {
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < 5-i ; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void LeapYear() {

		System.out.print("Enter the year : ");
		int year = sc.nextInt();

		if (year % 4 == 0) {

			if (year % 400 == 0) {
				System.out.println("The year " + year + " is a leap year.");
				return;
			}

			if (year % 100 != 0) {
				System.out.println("The year " + year + " is a leap year.");
				return;
			}

			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("The year " + year + " is a leap year.");
					return;
				} else {
					System.out.println("The year " + year + " is not a leap year.");
					return;
				}
			}

		} else {
			System.out.println("The year " + year + " is not a leap year.");
			return;
		}
	}

}
