package CharacterDemo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a symbol (any single symbol): ");
        String input = scanner.next();
        if (input.length() == 3 && input.charAt(0) == '\'' && input.charAt(2) == '\'') {
            char inputSymbol = input.charAt(1);
            Functions obj = new Functions(inputSymbol);
            System.out.println("Object initialized with symbol: " + obj.getSymbol());
        } else {
            System.out.println("Invalid input. Please enter a single symbol enclosed in single quotes.");
        }
	}
}
	