package BST;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create an instance of Functions class
        Functions f = new Functions();

        // Adding 5 elements to the binary search tree
        for (int i = 0; i < 5; i++) {
            f.add_elements();
        }

        // Display the tree in Inorder
        System.out.println("--------DISPLAY INORDER--------");
        f.display_inorder(Functions.Root);
        System.out.println();

        // Display the tree in Postorder
        System.out.println("--------DISPLAY POSTORDER--------");
        f.display_postorder(Functions.Root);
        System.out.println();

        // Display the tree in Preorder
        System.out.println("--------DISPLAY PREORDER--------");
        f.display_preorder(Functions.Root);
        System.out.println();

        // Search for an element in the tree
        f.search_element();

        // Delete an element from the tree
        f.delete_node();

        // Display the tree after deletion
        System.out.println("--------DISPLAY INORDER AFTER DELETION--------");
        f.display_inorder(Functions.Root);
        System.out.println();
    }
}
