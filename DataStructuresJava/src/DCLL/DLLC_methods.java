package DCLL;

import java.util.Scanner;

public class DLLC_methods {

    DLLCNode head; // Head of the circular doubly linked list

    // Add an element at the beginning of the circular doubly linked list
    void add_elements() {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the element : ");
    	int data = sc.nextInt();
    		
    	
        DLLCNode newnode = new DLLCNode(); // Create a new node
        newnode.data = data; // Store data in the new node

        if (head == null) { // If the list is empty
            head = newnode; // Set the new node as the head
            newnode.next = head; // Link the new node to itself (circular link)
            newnode.prev = head; // Link the new node to itself (circular link)
            return;
        }

        // Link the new node into the list at the beginning
        head.prev.next = newnode; // Previous tail’s next points to the new node
        newnode.prev = head.prev; // Set the previous of the new node to the previous tail
        newnode.next = head; // The new node points to the current head
        head.prev = newnode; // The head’s previous pointer points to the new node
        head = newnode; // Update head to the new node
    }

    // Add an element at the end of the circular doubly linked list
    void add_elements_end(int data) {
        DLLCNode newnode = new DLLCNode(); // Create a new node
        newnode.data = data; // Store data in the new node

        if (head == null) { // If the list is empty
            head = newnode; // Set the new node as the head
            newnode.next = head; // Link the new node to itself (circular link)
            newnode.prev = head; // Link the new node to itself (circular link)
            return;
        }

        DLLCNode temp = head;
        // Traverse to the last node (circular linked list condition)
        while (temp.next != head) {
            temp = temp.next;
        }

        // Link the new node to the end of the list
        newnode.next = head; // The new node points to the head
        newnode.prev = temp; // The new node’s previous points to the current tail
        temp.next = newnode; // The current tail’s next points to the new node
        head.prev = newnode; // The head’s previous points to the new node (closing the loop)
    }

    // Add an element at a specific index in the circular doubly linked list
    void add_elements_middle(int index, int data) {
        DLLCNode newnode = new DLLCNode(); // Create a new node
        newnode.data = data; // Store data in the new node

        if (head == null) { // If the list is empty
            System.out.println("The linked list is empty. Adding at the beginning.");
            head = newnode; // Set the new node as the head
            newnode.next = head; // Link the new node to itself (circular link)
            newnode.prev = head; // Link the new node to itself (circular link)
            return;
        }

        if (index == 0) { // If the index is 0, add the element at the beginning
            add_elements();
            return;
        }

        DLLCNode temp = head;
        int i = 0;
        // Traverse to the node before the specified index
        while (i < index - 1 && temp.next != head) {
            temp = temp.next;
            i++;
        }

        if (temp.next == head) { // If the index exceeds the list size
            System.out.println("Index out of bounds. Adding at the end.");
            add_elements_end(data); // Add at the end
            return;
        }

        // Insert the new node at the desired index
        newnode.next = temp.next; // The new node’s next points to the next node
        newnode.prev = temp; // The new node’s prev points to the previous node
        temp.next.prev = newnode; // The node after the new node’s previous points to the new node
        temp.next = newnode; // The previous node’s next points to the new node
    }

    // Delete the first element from the circular doubly linked list
    void del_first() {
        if (head == null) { // If the list is empty
            System.out.println("The linked list is empty.");
            return;
        }

        if (head.next == head) { // If there is only one node in the list
            head = null; // Set the head to null (empty list)
            return;
        }

        DLLCNode tail = head.prev; // Get the last node (tail)
        head = head.next; // Move head to the next node
        tail.next = head; // Link the tail’s next to the new head
        head.prev = tail; // Set the new head’s previous link to the tail (maintaining the circular link)
    }

    // Delete the last element from the circular doubly linked list
    void del_last() {
        if (head == null) { // If the list is empty
            System.out.println("The linked list is empty.");
            return;
        }

        if (head.next == head) { // If there is only one node in the list
            head = null; // Set the head to null (empty list)
            return;
        }

        DLLCNode tail = head.prev; // Get the last node (tail)
        tail.prev.next = head; // Set the second-to-last node’s next to the head
        head.prev = tail.prev; // Set the head’s previous pointer to the second-to-last node
    }

    // Delete a specific element by value from the circular doubly linked list
    void del_middle(int data) {
        if (head == null) { // If the list is empty
            System.out.println("The linked list is empty.");
            return;
        }

        if (head.data == data) { // If the first node is the target
            del_first();
            return;
        }

        DLLCNode temp = head;
        // Traverse the list to find the node with the given data
        while (temp.next != head && temp.data != data) {
            temp = temp.next;
        }

        if (temp.data != data) { // If the node is not found
            System.out.println("Element " + data + " not found.");
            return;
        }

        // Unlink the node from the list
        temp.prev.next = temp.next; // The previous node’s next points to the node after the current node
        temp.next.prev = temp.prev; // The next node’s prev points to the previous node
    }

    // Print the circular doubly linked list
    void print() {
        if (head == null) { // If the list is empty
            System.out.println("The linked list is empty.");
            return;
        }

        DLLCNode temp = head;
        // Traverse the list and print each node's data
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head); // Stop when we reach back to the head
        System.out.println(); // Print a newline at the end
    }
}
