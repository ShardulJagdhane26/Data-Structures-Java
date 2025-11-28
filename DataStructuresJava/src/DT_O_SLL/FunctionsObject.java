package DT_O_SLL;

import java.util.Scanner;

public class FunctionsObject {
	
	SLLNodeObj head ;
	Scanner s = new Scanner(System.in);
	
	void InsertAtBeginning() {
		System.out.print("Enter the element : ");
		Object data = s.next();
		
		SLLNodeObj newnode = new SLLNodeObj();
		newnode.data = data;
		
		if(head == null) {
			System.out.println("The Linked list is empty.");
			head=newnode;
			System.out.println(head.data  + " is added to the list.");
			return;
		}
		
		newnode.next = head;
		head=newnode;
		System.out.println(head.data  + " is added to the list.");
	}
	
	void Delete() {
	    System.out.println();
	    System.out.println("Delete Operation");
	    while (true) {
	    	System.out.println();
	        System.out.println("Options : ");
	        System.out.println("01. Delete wrt data");
	        System.out.println("02. Delete wrt index");
	        System.out.println("03. Exit");
	        System.out.println();
	        System.out.print("Enter choice : ");
	        int val = s.nextInt();
	        switch (val) {
	        
	            case 1: {
	                System.out.print("Enter the element : ");
	                Object element = s.next();
	                if (head == null) {
	                    System.out.println("The list is empty.");
	                    break;
	                }
	                // Handle deletion of head node
	                if (head.data.equals(element)) {
	                    head = head.next;
	                    System.out.println("The head element is deleted.");
	                    Display();
	                    break;
	                }
	                // Traverse the list
	                SLLNodeObj temp = head;
	                while (temp.next != null) {
	                    if (temp.next.data.equals(element)) {
	                        System.out.println("The element is found and deleted.");
	                        temp.next = temp.next.next;
	                        Display();
	                        break;
	                    }
	                    temp = temp.next;
	                }
	                if (temp.next == null) {
	                    System.out.println("The element is not present in the list.");
	                }
	                break;
	            }
	            
	            
	            case 2: {
	                System.out.print("Enter the index : ");
	                int index = s.nextInt();
	                if (head == null) {
	                    System.out.println("The list is empty.");
	                    break;
	                }
	                // Handle deletion of head node
	                if (index == 0) {
	                    head = head.next;
	                    System.out.println("The head element is deleted.");
	                    Display();
	                    break;
	                }
	                // Traverse the list
	                SLLNodeObj temp = head;
	                for (int i = 0; i < index - 1; i++) {
	                    if (temp == null || temp.next == null) {
	                        System.out.println("The given index is out of bounds.");
	                        break;
	                    }
	                    temp = temp.next;
	                }
	                if (temp != null && temp.next != null) {
	                    temp.next = temp.next.next;
	                    System.out.println("Element at index " + index + " is deleted.");
	                    Display();
	                }
	                break;
	            }
	            
	            
	            case 3: {
	                System.out.println("Exit");
	                return;
	            }
	            
	            
	            default:
	            	System.out.println("Unexpected value: " + val );
					break;
	                
	        }
	        
	        
	        System.out.println();
	    }
	}

	void Display() {
		System.out.println();
		System.out.println("Display Elements");
		
		if(head == null) {
			System.out.println("The Linked list is empty.");
			return;
		}
		
		SLLNodeObj temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
	}

}
