package DY_O_DLL;

import java.util.Scanner;

public class Methods {
	Node head;
	Scanner sc = new Scanner(System.in);
	
	void Insert() {
		while(true) {
			System.out.println();
			System.out.println("Insert Operation");
			System.out.println("1.Insert At Beginning");
			System.out.println("2.Insert At Ending");
			System.out.println("3.Insert At Random");
			System.out.println("4.Exit Insert Operation");
			System.out.println();
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:{
						System.out.print("Enter the element : ");
						Object element = sc.next();
						Node newnode = new Node();
						newnode.data = element;
						newnode.next = null;
						newnode.prev = null;
						if(head == null) {
							System.out.println("The DLL is empty.");
							head = newnode;
							System.out.println("The element " + head.data + " is added to DLL." );
							System.out.println();
							Display();
							break;
						}
						newnode.next = head;
						head.prev = newnode ;
						head=newnode;
						System.out.println("The element " + head.data + " is added to DLL." );
						System.out.println();
						Display();
						break;
				}
				case 2:{
					System.out.print("Enter the element : ");
					Object element = sc.next();
					Node newnode = new Node();
					newnode.data = element;
					newnode.next = null;
					newnode.prev = null;
					if(head == null) {
						System.out.println("The DLL is empty.");
						head = newnode;
						System.out.println("The element " + head.data + " is added to DLL." );
						System.out.println();
						Display();
						break;
					}
					Node temp = head;
					while (temp.next != null) {
						temp=temp.next;
					}
					temp.next = newnode;
					newnode.prev = temp;
					System.out.println("The element " + newnode.data + " is added to DLL." );
					System.out.println();
					Display();
					break;
				}
				case 3:{
					System.out.print("Enter the element : ");
					Object element = sc.next();
					System.out.print("Enter the index : ");
					int index = sc.nextInt();
					Node newnode = new Node();
					newnode.data = element;
					newnode.next = null;
					newnode.prev = null;
					if(index  == 0 ) {
						newnode.next = head;
						head.prev = newnode;
						head = newnode;
						System.out.println("The element " + head.data + " is added to DLL." );
						System.out.println();
						Display();
						break;
					}
					
					Node temp = head ;
					for (int i = 0; i < index - 1 ; i++) {
						if( i < index && temp == null) {
							System.out.println("The index is out of bounds.");
							break;
						}
						temp = temp.next;
					}
					
					if(temp.next == null ) {
						temp.next = newnode;
						newnode.prev = temp;
						System.out.println("The element " + newnode.data + " is added to DLL." );
						System.out.println();
						Display();
						break;
					}
					newnode.prev = temp;
					newnode.next = temp.next;
					temp.next.prev = newnode;
					temp.next = newnode;
					System.out.println("The element " + newnode.data + " is added to DLL." );
					System.out.println();
					Display();
					break;
				}
				case 4:{
					System.out.println("Exit Insert Operation");
					return;
				}
				default:{
					System.out.println("Invalid Input : " + choice);
					break;
				}
			}
		}
	}
	
	
	
	void Delete() {
		while(true) {
			System.out.println();
			System.out.println("Delete Operation");
			System.out.println("1.Delete First Element");
			System.out.println("2.Delete Last Element");
			System.out.println("3.Delete Random Element");
			System.out.println("4.Exit Delete Operation");
			System.out.println();
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:{
				System.out.println("Delete first element.");
				if(head == null) {
					System.out.println("The DLL is empty");
					break;
				}
				if(head.next == null) {
					System.out.println("There is only one element in DLL");
					Object temp = head.data;
					head=null;
					System.out.println("The head element " + temp + " is removed frm the DLL.");
					Display();
					break;
				}
				Object temp = head.data;
				head.next.prev =null;
				head=head.next;
				System.out.println("The element " + temp + " is removed frm the DLL.");
				Display();
				break;
			}
			case 2:{
				System.out.println("Delete last element");
				if(head == null) {
					System.out.println("The DLL is empty");
					break;
				}
				if(head.next == null) {
					System.out.println("There is only one element in DLL");
					Object temp = head.data;
					head=null;
					System.out.println("The head element " + temp + " is removed frm the DLL.");
					Display();
					break;
				}
				Node temp = head;
				while(temp.next.next != null) {
					temp=temp.next;
				}
				Object dat = temp.next.data;
				temp.next.prev = null;
				temp.next = null;
				System.out.println("The element " + dat + " is removed frm the DLL.");
				Display();
				break;
			}	
			case 3:{
				System.out.println("Delete random elment");
				if(head == null) {
					System.out.println("The DLL is empty");
					break;
				}
				System.out.println("1.Delete WRT Index");
				System.out.println("2.Delete WRT Data");
				System.out.println();
				System.out.print("enter ur choice : ");
				System.out.println();
				int key = sc.nextInt();
				switch (key) {
					case 1:{
						System.out.println("Delete wrt index");
						System.out.print("Enter the index : ");
						int index = sc.nextInt();
						if(index == 0 ) {
							Object temp = head.data;
							head.next.prev =null;
							head=head.next;
							System.out.println("The element " + temp + " is removed frm the DLL.");
							Display();
							break;
						}
						Node temp = head;
						for (int i = 0; i < index-1 ; i++) {
							if(i < index && temp.next == null ) {
								System.out.println("The given index is out of bounds.");
								break;
							}
							temp=temp.next;
						}
						Object dat = temp.next.data;
						temp.next.prev = null;
						temp.next=temp.next.next;
						temp.next.prev = temp;
						System.out.println("The element " + dat + " is removed frm the DLL.");
						Display();
						break;
					}
					case 2:{
						System.out.println("Delete wrt element");
						System.out.print("Enter the element : ");
						Object element  = sc.next();
						Node temp = head;
						while(temp != null) {
							if(temp.next.data.equals(element)) {
								temp.next.prev = null;
								temp.next=temp.next.next;
								temp.next.prev = temp;
								System.out.println("The element " + element + " is removed frm the DLL.");
								Display();
								break;
							}
							temp=temp.next;
						}
						if(temp == null) {
							System.out.println("The element is not present in DLL");
						}
						break;
					}
					default:
						System.out.println("Invalid Input : " + key);
						break;
				}
				break;
			}
			case 4:{
				System.out.println("Exit Delete Operation");
				return;
			}
			default:
				System.out.println("Invalid Input : " + choice);
				break;
			}
		}
	}
	
	void Display() {
		System.out.println("Display Elements");
		if(head == null) {
			System.out.println("The DLL is empty");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
}
