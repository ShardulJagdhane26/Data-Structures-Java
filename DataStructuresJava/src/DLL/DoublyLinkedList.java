package DLL;

public class DoublyLinkedList {

    DLLNode head; // Head of the doubly linked list

    // Method to add an element at the beginning of the list
    void add_first(int data) {
        DLLNode newnode = new DLLNode(); // Create a new node
        newnode.data = data; // Store the data in the new node

        if (head == null) { // If the list is empty
            head = newnode; // Set the new node as the head
            return;
        }

        newnode.next = head; // Link the new node to the current head
        head.prev = newnode; // Set the previous link of the current head to the new node
        head = newnode; // Update head to point to the new node
    }

    // Method to add an element at the end of the list
    void add_last(int data) {
        DLLNode newnode = new DLLNode(); // Create a new node
        newnode.data = data; // Store the data in the new node

        if (head == null) { // If the list is empty
            head = newnode; // Set the new node as the head
            return;
        }

        DLLNode temp = head; // Start from the head
        while (temp.next != null) { // Traverse to the last node
            temp = temp.next;
        }

        temp.next = newnode; // Link the last node to the new node
        newnode.prev = temp; // Set the previous link of the new node to the last node
    }

    // Method to add an element at a specific index in the list
    void add_middle(int data, int index) {
        DLLNode newnode = new DLLNode(); // Create a new node
        newnode.data = data; // Store the data in the new node

        if (head == null) { // If the list is empty
            System.out.println("The linked list is empty. Adding at the beginning.");
            head = newnode; // Set the new node as the head
            return;
        }

        if (index == 0) { // If the index is 0, add at the beginning
            add_first(data);
            return;
        }

        DLLNode temp = head; // Start from the head
        int i = 0;

        // Traverse to the node before the desired index
        while (i < index - 1 && temp.next != null) {
            temp = temp.next;
            i++;
        }

        // If the index exceeds the size of the list, add at the end
        if (temp.next == null) {
            System.out.println("Index out of bounds. Adding at the end.");
            add_last(data);
            return;
        }

        newnode.next = temp.next; // Link the new node to the next node
        if (temp.next != null) { // If there's a node after the new node
            temp.next.prev = newnode; // Set the previous link of the next node to the new node
        }
        temp.next = newnode; // Link the previous node to the new node
        newnode.prev = temp; // Set the previous link of the new node to the previous node
    }

    // Method to delete the first element in the list
    void del_first() {
        if (head == null) { // If the list is empty
            System.out.println("The linked list is empty.");
            return;
        }

        head = head.next; // Update head to the next node
        if (head != null) { // If there is a node after the head
            head.prev = null; // Set the previous link of the new head to null
        }
    }

    // Method to delete the last element in the list
    void del_last() {
        if (head == null) { // If the list is empty
            System.out.println("The linked list is empty.");
            return;
        }

        if (head.next == null) { // If there's only one node in the list
            head = null; // Set the head to null
            return;
        }

        DLLNode temp = head; // Start from the head
        while (temp.next != null) { // Traverse to the last node
            temp = temp.next;
        }

        temp.prev.next = null; // Set the next link of the second-to-last node to null, removing the last node
    }

    // Method to delete a specific element by its value
    void del_middle(int data) {
        if (head == null) { // If the list is empty
            System.out.println("The linked list is empty.");
            return;
        }

        DLLNode temp = head; // Start from the head

        // Traverse the list to find the node with the given data
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp == null) { // If the element is not found
            System.out.println("Element " + data + " not found.");
            return;
        }

        // If the node to be deleted is not the head
        if (temp.prev != null) {
            temp.prev.next = temp.next; // Set the next link of the previous node to the next node
        } else { // If the node to be deleted is the head
            head = temp.next;
        }

        // If the node to be deleted is not the last node
        if (temp.next != null) {
            temp.next.prev = temp.prev; // Set the previous link of the next node to the previous node
        }

        System.out.println("Element " + data + " deleted.");
    }

    // Method to print the linked list
    void print() {
    	System.out.println();
    	System.out.println("Display Elements");
        if (head == null) { // If the list is empty
            System.out.println("The linked list is empty.");
            return;
        }

        DLLNode temp = head; // Start from the head
        while (temp != null) { // Traverse through the list
            System.out.print(temp.data + " "); // Print the data of each node
            temp = temp.next; // Move to the next node
        }
        System.out.println(); // Print a newline after displaying all elements
    }
}
