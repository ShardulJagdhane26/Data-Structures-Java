package SLL;

import java.util.Scanner;

public class SinglyLinkList {
	SLLNode head; // Head of the linked list

	Scanner sc = new Scanner(System.in); // Scanner for user input

	void Insert_beg(int data,SLLNode next) {
		
		
		SLLNode newnode = new SLLNode(data,next);
		if (head == null) { // If the list is empty
			System.out.println("The liked list is empty."); 
			head = newnode; // Set the head to the new node
			return;
		}
		newnode.setNext(head); // Link the new node to the current head
		head = newnode;

	}

	// Method to add a node at the beginning of the list
	void addAtFirst() {

		System.out.println("Enter the element :");
		int data = sc.nextInt(); // Take the input from the user

		SLLNode newnode = new SLLNode(); // Allocate storage for the new node
		newnode.setData(data); // Store the data in the new node

		if (head == null) { // If the list is empty
			System.out.println("The liked list is empty.");
			head = newnode; // Set the head to the new node
			return;
		}
		newnode.setNext(head); // Link the new node to the current head
		head = newnode; // Update head to point to the new node
	}

	// Method to add a node at the end of the list
	void addAtLast() {
		System.out.println("Enter the element :");
		int data = sc.nextInt(); // Take input from the user

		SLLNode newnode = new SLLNode(); // Allocate storage for the new node
		newnode.setData(data); // Store the data in the new node

		if (head == null) { // If the list is empty
			System.out.println("The liked list is empty.");
			head = newnode; // Set the head to the new node
			return;
		}

		SLLNode temp = head; // Start from the head
		while (temp.getNext() != null) { // Traverse to the last node
			temp = temp.getNext();
		}

		temp.setNext(newnode); // Set the next of the last node to the new node
	}

	// Method to add a node at a specific position (middle of the list)
	void addAtmiddle() {
		System.out.println("Enter the element :");
		int data = sc.nextInt(); // Take input from the user

		System.out.println("Enter the location of element :");
		int loc = sc.nextInt(); // Take the location from the user

		SLLNode newnode = new SLLNode(); // Allocate storage for the new node
		newnode.setData(data); // Store the data in the new node

		if (head == null) { // If the list is empty
			System.out.println("The liked list is empty.");
			head = newnode; // Set the head to the new node
			return;
		}

		SLLNode temp = head; // Start from the head
		// Traverse to the location just before the desired insertion position
		for (int i = 0; i < loc - 1; i++) {
			if (i <= loc && temp.getNext() == null) { // If the location is out of bounds
				System.out.println("The location is out of bounds for the linked list");
				return;
			}
			temp = temp.getNext();
		}

		newnode.setNext(temp.getNext()); // Link the new node to the next node
		temp.setNext(newnode); // Link the previous node to the new node
	}

	// Method to delete the first node of the list
	void deleteFirst() {
		if (head == null) { // If the list is empty
			System.out.println("The liked list is empty.");
			return;
		}
		SLLNode x = head; // Store the current head

		head = head.getNext(); // Update head to point to the next node
		x.setNext(null); // Disconnect the original head
	}

	// Method to delete the last node of the list
	void deleteLast() {
		if (head == null) { // If the list is empty
			System.out.println("The liked list is empty.");
			return;
		}
		SLLNode trav = head; // Start from the head
		while (trav.getNext().getNext() != null) { // Traverse to the second-to-last node
			trav = trav.getNext();
		}
		trav.setNext(null); // Set the next of the second-to-last node to null, removing the last node
	}

	// Method to delete a node at a specific position (middle)
	void deleteMiddle() {
		System.out.println("Enter the location of element :");
		int loc = sc.nextInt(); // Take the location from the user

		if (head == null) { // If the list is empty
			System.out.println("The liked list is empty.");
			return;
		}

		if (loc == 0) {
			deleteFirst();
			return;
		}

		if (loc < 0) {
			System.out.println("The location entered is invalid.");
			return;
		}

		SLLNode temp = head; // Start from the head
		// Traverse to the location just before the node to be deleted
		for (int i = 0; i < loc - 1; i++) {

			if (i <= loc && temp.getNext() == null) { // If the location is out of bounds
				System.out.println("The location is out of bounds for the linked list.");
				return;
			}
			temp = temp.getNext();
		}

		temp.setNext(temp.getNext().getNext()); // Bypass the node to be deleted
	}

	// Method to find the location of a specific element in the list
	void findLocation() {
		System.out.println("Enter the element :");
		int data = sc.nextInt(); // Take input from the user

		if (head == null) { // If the list is empty
			System.out.println("The liked list is empty.");
			return;
		}

		SLLNode temp = head; // Start from the head
		int i = 0; // Index to track the location of the element

		// Traverse through the list to find the element
		while (temp != null && temp.getData() != data) {
			temp = temp.getNext();
			i++;
		}

		if (temp == null) {
			System.out.println("Element not found in the list.");
		} else {
			System.out.println("Location of element: " + i); // Print the index of the element
		}
	}

	// Method to reverse the linked list
	void reverse() {
		if (head == null) { // If the list is empty
			System.out.println("The linked list is empty.");
			return;
		}

		SLLNode prev = null; // To keep track of the previous node
		SLLNode current = head; // To keep track of the current node
		SLLNode next; // To store the next node temporarily

		while (current != null) { // Traverse through the list
			next = current.getNext(); // Store the next node
			current.setNext(prev); // Reverse the link
			prev = current; // Move prev to the current node
			current = next; // Move to the next node
		}

		head = prev; // Update the head to the new front
		System.out.println("The linked list has been reversed.");
		print(); // Print the reversed list
	}

	// Method to print the entire linked list
	void print() {
		System.out.println();
		System.out.println("----------------Display--------------");
		System.out.println();
		if (head == null) { // If the list is empty
			System.out.println("The liked list is empty.");
			return;
		}

		SLLNode temp = head; // Start from the head
		while (temp != null) { // Traverse through the list
			System.out.print(temp.getData() + " "); // Print the data of each node
			temp = temp.getNext(); // Move to the next node
		}
		System.out.println(); // New line after displaying all elements
	}
}
