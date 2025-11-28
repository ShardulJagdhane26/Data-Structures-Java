package HashTable;

import java.util.*;

public class Methods {

	Scanner sc = new Scanner(System.in);

	// Array of HashNode to represent the buckets of the hash table
	HashNode[] buckets = new HashNode[16];

	// Method to add data into the hash table
	void addData(int data) {
		// Calculate the index for the bucket where data should be added
		int index = data % buckets.length;

		// Create a new HashNode for the data
		HashNode newNode = new HashNode(data);

		// If the bucket is empty, add the data directly to the bucket
		if (buckets[index] == null) {
			buckets[index] = newNode;
			System.out.println("Data added: " + data);
			return;
		}

		// If the bucket is not empty, traverse through the linked list to add the data
		HashNode temp = buckets[index];
		while (temp != null) {
			if (temp.data == data) {
				// If data already exists in the bucket, don't add it again
				System.out.println("The hash table already contains this data: " + data);
				return;
			}
			if (temp.next == null) {
				// If we have reached the end of the linked list, break out of the loop
				break;
			}
			temp = temp.next;
		}

		// Add the new node at the end of the list in the bucket
		temp.next = newNode;
		System.out.println("Data added: " + data);
	}

	// Method to remove an element from the hash table
	void remove_element(int data) {
		// Calculate the index for the bucket where the data might be
		int index = data % buckets.length;
		HashNode temp = buckets[index];

		// If the bucket is empty, print a message and return
		if (buckets[index] == null) {
			System.out.println("The element is not present in the hash table.");
			return;
		}

		if (temp.data == data) {

			buckets[index] = temp.next;
			System.out.println("Data removed: " + data);
			return;
		}

		// Traverse through the linked list to find the node with the data
		while (temp != null) {
			if (temp.next != null && temp.next.data == data) {
				// If the next node contains the data, remove it from the list
				temp.next = temp.next.next;
				System.out.println("Data removed: " + data);
				break;
			}
			if (temp.next == null) {
				// If the data is not found, print a message
				System.out.println("The element is not present in the hash table.");
				break;
			}
			temp = temp.next;
		}

	}

	// Method to search for an element in the hash table
	void search(int data) {
		// Calculate the index for the bucket where the data might be
		int index = data % buckets.length;

		// If the bucket is empty, print a message and return
		if (buckets[index] == null) {
			System.out.println("The element is not present in the hash table.");
			return;
		}

		HashNode temp = buckets[index];
		int i = 0;

		// Traverse the linked list in the bucket to find the data
		while (temp != null) {
			if (temp.data == data) {
				// If the data is found, print the bucket index and the location in the list
				System.out.println("The element found at bucket no " + index);
				System.out.println("The element is found at location " + i + " in the bucket.");
				return;
			}
			temp = temp.next;
			i++;
		}

		// If the data is not found in the bucket
		System.out.println("The element is not present in the hash table.");
	}

	// Method to display all elements in the hash table
	void display() {
		System.out.println("----------------------- Display elements ------------------ ");

		// Iterate over all the buckets in the hash table
		for (int i = 0; i < buckets.length; i++) {
			System.out.println("Bucket No. : " + i);
			HashNode temp = buckets[i];

			// Traverse the linked list in the bucket and print all elements
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println(); // Move to the next line after printing each bucket's data
		}
	}
}
