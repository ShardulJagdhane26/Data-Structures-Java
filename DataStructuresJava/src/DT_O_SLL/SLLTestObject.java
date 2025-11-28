package DT_O_SLL;

import java.util.Scanner;

public class SLLTestObject {
	
	public static void main(String[] args) {
		FunctionsObject o = new FunctionsObject();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println(".........Singly Linked List........");
			System.out.println(".......[ Data type : Object ]......");
			System.out.println();
			System.out.println("01.Insert element at beginning.");
			System.out.println("02.Display elements.");
			System.out.println("03.Delete Elements.");
			System.out.println("04.Exit");
			System.out.println();
			System.out.print("Enter choice : ");
			int choice = sc.nextInt();
			switch (choice) {
				case 1: {
					System.out.println();
					System.out.println("Insert at Beginning");
					int quantity = 0;
					System.out.print("Enter the number of elements : ");
					quantity = sc.nextInt();
					for (int i = 0; i < quantity ; i++) {
						o.InsertAtBeginning();
					}
					o.Display();
					System.out.println();
					break;
				}
				case 2: {
					o.Display();
					System.out.println();
					break;
				}
				case 3: {
					o.Delete();
					break;
				}
				case 4: {
					System.out.println("................Exit................");
					return;
				}
				default:
					System.out.println("Unexpected value: " + choice);
					break;
				}
		}	
	}		
}



