package SCLL;

public class Methods {

    SCLNode head; // Head of the circular singly linked list

    // Add element at the beginning of the circular linked list
    void add_first(int data) {
        SCLNode newnode = new SCLNode(data); // Create a new node with the given data
        if (head == null) { // If the list is empty
            head = newnode; // Set the new node as the head
            head.next = head; // Link the node to itself (circular list)
            return;
        }

        SCLNode temp = head;
        while (temp.next != head) { // Traverse to the last node
            temp = temp.next;
        }

        newnode.next = head; // The new node points to the head (circular link)
        temp.next = newnode; // The last node’s next points to the new node
        head = newnode; // Set the new node as the head
    }

    // Add element at the end of the circular linked list
    void add_last(int data) {
        SCLNode newnode = new SCLNode(data); // Create a new node with the given data
        if (head == null) { // If the list is empty
            head = newnode; // Set the new node as the head
            head.next = head; // Link the node to itself (circular list)
            return;
        }

        SCLNode temp = head;
        while (temp.next != head) { // Traverse to the last node
            temp = temp.next;
        }

        temp.next = newnode; // The last node’s next points to the new node
        newnode.next = head; // The new node points to the head (circular link)
    }

    // Add element at a specific index in the circular linked list
    void add_middle(int data, int index) {
        if (index == 0) { // If the index is 0, add the element at the beginning
            add_first(data);
            return;
        }

        SCLNode newnode = new SCLNode(data); // Create a new node with the given data
        if (head == null) { // If the list is empty
            System.out.println("List is empty, adding at the beginning.");
            head = newnode; // Set the new node as the head
            head.next = head; // Link the node to itself (circular list)
            return;
        }

        SCLNode temp = head;
        int i = 0;

        // Traverse to the node before the desired index
        while (i < index - 1 && temp.next != head) {
            temp = temp.next;
            i++;
        }

        if (temp.next == head) { // If the index exceeds the list size, add at the end
            System.out.println("Index out of bounds, adding at the end.");
            add_last(data);
            return;
        }

        newnode.next = temp.next; // The new node points to the next node
        temp.next = newnode; // The previous node’s next points to the new node
    }

    // Delete the first element in the circular linked list
    void del_first() {
        if (head == null) { // If the list is empty
            System.out.println("The list is empty.");
            return;
        }

        if (head.next == head) { // If there is only one node in the list
            head = null; // Set the head to null (empty list)
            return;
        }

        SCLNode temp = head;
        while (temp.next != head) { // Traverse to the last node
            temp = temp.next;
        }

        temp.next = head.next; // The last node’s next points to the second node
        head = head.next; // The head is moved to the second node
    }

    // Delete the last element in the circular linked list
    void del_last() {
        if (head == null) { // If the list is empty
            System.out.println("The list is empty.");
            return;
        }

        if (head.next == head) { // If there is only one node in the list
            head = null; // Set the head to null (empty list)
            return;
        }

        SCLNode temp = head;
        while (temp.next.next != head) { // Traverse to the second-to-last node
            temp = temp.next;
        }

        temp.next = head; // The second-to-last node’s next points to the head (circular link)
    }

    // Delete a specific element by value from the circular linked list
    void del_middle(int data) {
    	
        if (head == null) { // If the list is empty
            System.out.println("The list is empty.");
            return;
        }

        if (head.data == data) { // If the head is the target node
            del_first(); // Remove the first element
            return;
        }

        SCLNode temp = head;
        while (temp.next != head && temp.next.data != data) { // Traverse to find the node with the given data
            temp = temp.next;
        }

        if (temp.next == head) { // If the element is not found
            System.out.println("Element " + data + " not found.");
            return;
        }

        temp.next = temp.next.next; // Remove the node by skipping it in the list
    }

    // Print the circular singly linked list
    void print() {
        if (head == null) { // If the list is empty
            System.out.println("The list is empty.");
            return;
        }

        SCLNode temp = head;
        do {
            System.out.print(temp.data + " "); // Print the data of each node
            temp = temp.next; // Move to the next node
        } while (temp != head); // Stop when we return to the head (circular list)
        System.out.println(); // Print a newline at the end
    }
}
