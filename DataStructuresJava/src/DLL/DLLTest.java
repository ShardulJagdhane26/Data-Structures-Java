package DLL;

import java.util.Scanner;

public class DLLTest {
	
	public static void main(String args[]) {
	
		DoublyLinkedList o = new DoublyLinkedList();

		  int choice =0;
		  
		  while (choice < 8) {
			  
			  System.out.println();
			  System.out.println("............Doubly Linked List...........");
			  System.out.println();
			  System.out.println("1.Insert At Beginning");
			  System.out.println("2.Insert At Ending");
			  System.out.println("3.Insert At Random Position");
			  System.out.println("4.Delete At Beginning");
			  System.out.println("5.Delete At Ending");
			  System.out.println("6.Delete At Random Position");
			  System.out.println("7.Display Linked List");
			  System.out.println("8.Exit");
			  System.out.println();
			  
			  System.out.print("Enter yor choice : ");
			  Scanner sc = new Scanner(System.in);
			  choice = sc.nextInt();
			  System.out.println();
			  
				  switch (choice) {
				  
					case 1: {
						System.out.println("Insert At Beginning");
						System.out.print("Enter number of elements : ");
						int quantity = sc.nextInt();
						for(int i = 0 ;i < quantity ;i++) {
							int element;
							System.out.print("Enter the element : ");
							element = sc.nextInt();
							o.add_first(element);
						  }
						  o.print();
						  break;
					}
					case 2: {
						System.out.println("Insert At Ending");
						System.out.print("Enter number of elements : ");
						int quantity = sc.nextInt();
						for(int i = 0 ;i < quantity ;i++) {
							int element;
							System.out.print("Enter the element : ");
							element = sc.nextInt();
							o.add_last(element);
						  }
						  o.print();
						  break;
					}
					case 3: {
						System.out.println("Insert At Random Position");
						int element;
						System.out.print("Enter the element : ");
						element = sc.nextInt();
						int location;
						System.out.print("Enter the location : ");
						location = sc.nextInt();
						o.add_middle(element, location);
						o.print();
						break;
					}
					case 4: {
						System.out.println("Delete At Beginning");
						o.del_first();;
						o.print();
						break;
					}
					case 5: {
						System.out.println("Delete At Ending");
						o.del_last();
						o.print();
						break;
					}
					case 6: {
						System.out.println("Delete At Random Position");
						int element;
						System.out.print("Enter the element : ");
						element = sc.nextInt();
						o.del_middle(element);
						o.print();
						break;
					}
					case 7: {
						o.print();
						break;
					}
					case 8: {
						System.out.println("Thank You!!");
						return;
					}
					default:
						System.out.println("Invalid Input !!");
						break;
					}
			  }
	}
}
