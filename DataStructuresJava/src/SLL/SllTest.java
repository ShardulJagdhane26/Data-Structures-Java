package SLL;

import java.util.Scanner;

public class SllTest {
	public static void main(String[] args) {

		SinglyLinkList s = new SinglyLinkList();

	  int choice =0;
	  
	  while (choice < 10) {
		  
		  System.out.println();
		  System.out.println("............Singly Linked List...........");
		  System.out.println();
		  System.out.println("01.Insert At Beginning");
		  System.out.println("02.Insert At Ending");
		  System.out.println("03.Insert At Random Position");
		  System.out.println("04.Delete At Beginning");
		  System.out.println("05.Delete At Ending");
		  System.out.println("06.Delete At Random Position");
		  System.out.println("07.Find Location of Element");
		  System.out.println("08.Reverse the Linked List");
		  System.out.println("09.Display Linked list");
		  System.out.println("10.Exit");
		  System.out.println();
		  
		  System.out.print("Enter yor choice : ");
		  Scanner sc = new Scanner(System.in);
		  choice = sc.nextInt();
		  
			  switch (choice) {
			  
				case 1: {
					System.out.print("Enter number of elements : ");
					int quantity = sc.nextInt();
					for(int i = 0 ;i < quantity ;i++) {
						  s.addAtFirst();
					  }
					  s.print();
					  break;
				}
				case 2: {
					System.out.print("Enter number of elements : ");
					int quantity = sc.nextInt();
					for(int i = 0 ;i < quantity ;i++) {
						  s.addAtLast();
					  }
					  s.print();
					  break;
				}
				case 3: {
					s.addAtmiddle();
					s.print();
					break;
				}
				case 4: {
					s.deleteFirst();
					s.print();
					break;
				}
				case 5: {
					s.deleteLast();
					s.print();
					break;
				}
				case 6: {
					s.deleteMiddle();
					s.print();
					break;
				}
				case 7: {
					s.findLocation();
					s.print();
					break;
				}
				case 8: {
					System.out.println("------------Reverse-----------");
					s.reverse();
					break;
				}
				case 9: {
					s.print();
					break;
				}
				case 10: {
					System.out.println("Thank You");
					return;
				}
				default:
					System.out.println("Invalid Input");
					break;
				}
		  }

//		s.Insert_beg(24,null);
//		s.Insert_beg(54,null);
//		
//		s.print();
	}
}
