package Stack;

import java.util.Scanner;

public class Methods {
    
    // Declare the 'head' pointer for the stack (top of the stack)
    Node head = null;

    // Method to check if the stack is empty
    boolean isEmpty() {
        return head == null;  // Return true if the stack is empty (head is null)
    }
    
    // Method to push an element onto the stack
    void push() {
        
        // Scanner to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to add: ");
        int data = sc.nextInt();  // Read the integer value
        
        // Create a new node with the given data
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;  // Set the 'next' pointer of the new node to null
        
        // If the stack is empty, the new node becomes the head (top of the stack)
        if (isEmpty()) {
            head = newnode;
            System.out.println("Element " + head.data + " is added to the stack.");
            return;
        }
        
        // If the stack is not empty, push the new node onto the top of the stack
        newnode.next = head;  // Point the new node to the current top of the stack (head)
        head = newnode;  // Update the head to the new node (it becomes the top of the stack)
        
        System.out.println("Element " + head.data + " is added to the stack.");
    }

    // Method to pop an element from the stack (remove the top element)
    void pop() {
        if (isEmpty()) {  // Check if the stack is empty
            System.out.println("The stack is empty.");
            return;
        }
        
        int head_data = head.data;  // Store the data of the top element
        head = head.next;  // Move the head pointer to the next node (remove the top element)
        
        System.out.println("Element " + head_data + " is popped from the stack.");
    }

    // Method to view the top element of the stack without removing it
    void peek() {
        if (isEmpty()) {  // Check if the stack is empty
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The element at the top: " + head.data);  // Print the top element
        }
    }
    
    // Method to display all elements in the stack
    void display() {
        Node temp = head;  // Initialize a temporary pointer to the top of the stack
        
        if (isEmpty()) {  // Check if the stack is empty
            System.out.println("The stack is empty.");
            return;
        }
        
        // Print a message indicating that elements are being displayed
        System.out.println("--------Elements in Stack---------");
        
        // Traverse through the stack and print each element
        while (temp != null) {
            System.out.print(temp.data + " ");  // Print the data of the current node
            temp = temp.next;  // Move to the next node in the stack
        }
        
        System.out.println();  // Print a newline after displaying the elements
        System.out.println("-----------------------------------");  // Closing line
    }
}