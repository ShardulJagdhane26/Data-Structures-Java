package Queue;

import java.util.Scanner;

public class Queue_Functions {
    
    // Declare the front and back pointers for the queue
    Queue_Node front = null;
    Queue_Node back = null;
    
    // Method to add an element to the queue
    void add_element() {
        // Scanner to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element: ");
        int data = sc.nextInt();
        System.out.println();
        
        // Create a new node with the input data
        Queue_Node newnode = new Queue_Node();
        newnode.data = data;
        newnode.next = null;  // The next pointer is initially null as it's the last node
        
        // If the queue is empty (both front and back are null), set both front and back to the new node
        if (front == null && back == null) {
            front = back = newnode;
            return;
        }
        
        // If the queue is not empty, link the new node to the back of the queue
        back.next = newnode;
        // Move the back pointer to the new node, as it's now the last node in the queue
        back = newnode;
    }
    
    // Method to remove an element from the queue
    void remove_element() {
        // Check if the queue is empty
        if (front == null && back == null) {
            System.out.println("The queue is empty.");
            return;
        }
        
        // If the queue has only one element (front and back are the same), set both pointers to null
        if (front == back) {
            System.out.println("Element " + front.data + " is removed from the queue.");
            front = back = null;
            return;
        }
        
        // Remove the front element of the queue
        System.out.println("Element " + front.data + " is removed from the queue.");
        front = front.next; // Move the front pointer to the next node
    }
    
    // Method to print all elements in the queue
    void print_elements() {
        System.out.println("---------------Elements---------------");
        
        // If the queue is empty, print a message and return
        if (front == null && back == null) {
            System.out.println("The queue is empty.");
            return;
        }
        
        // Traverse the queue and print each element
        Queue_Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; // Move to the next node
        }
        System.out.println();  // Print a newline after displaying the elements
        System.out.println("---------------------------------------");
    }
}
