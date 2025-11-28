package BST;

import java.util.Scanner;

public class Functions {

    // Root node of the binary search tree
    static Node_Structure Root = null;

    // Method to add an element to the binary search tree
    public void add_elements() {
        // Scanner to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element: ");
        int data = sc.nextInt();

        // Creating a new node to store the input data
        Node_Structure newnode = new Node_Structure(data);

        // If the tree is empty (root is null), the new node becomes the root
        if (Root == null) {
            Root = newnode;
            return;
        }

        // Traversing the tree to find the correct position for the new node
        Node_Structure current = Root;
        Node_Structure parent = null;

        while (true) {
            parent = current;
            // If data is less than the current node's data, move to the left subtree
            if (data < current.data) {
                current = current.left;
                // If the left child is null, insert the new node here
                if (current == null) {
                    parent.left = newnode;
                    return;
                }
            }
            // If data is greater than the current node's data, move to the right subtree
            else if (data > current.data) {
                current = current.right;
                // If the right child is null, insert the new node here
                if (current == null) {
                    parent.right = newnode;
                    return;
                }
            }
        }
    }

    // Method to perform inorder traversal: Left -> Root -> Right
    public void display_inorder(Node_Structure node) {
        if (node != null) {
            display_inorder(node.left);
            System.out.print(node.data + " ");
            display_inorder(node.right);
        }
    }

    // Method to perform preorder traversal: Root -> Left -> Right
    public void display_preorder(Node_Structure node) {
        if (node != null) {
            System.out.print(node.data + " ");
            display_preorder(node.left);
            display_preorder(node.right);
        }
    }

    // Method to perform postorder traversal: Left -> Right -> Root
    public void display_postorder(Node_Structure node) {
        if (node != null) {
            display_postorder(node.left);
            display_postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Method to search for an element in the binary search tree
    public void search_element() {
        // Scanner to take input from the user
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int data = sc.nextInt();

        Node_Structure current = Root;

        // Traverse the tree to search for the element
        while (current != null) {
            if (data == current.data) {
                System.out.println("The element " + data + " is present in the BSTree.");
                return;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        System.out.println("The element " + data + " is not found in the BSTree.");
    }

    // Method to delete a node from the binary search tree
    public void delete_node() {
        // Scanner to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to delete: ");
        int data = sc.nextInt();

        // Call delete function
        Root = delete(Root, data);
        System.out.println("Element " + data + " deleted from the BSTree.");
    }

    // Delete function
    public static Node_Structure delete(Node_Structure root, int val) {
        if (root == null) return null;

        // If value to be deleted is smaller than root's value, move to the left subtree
        if (root.data < val) {
            root.right = delete(root.right, val);
        } 
        // If value to be deleted is greater than root's value, move to the right subtree
        else if (root.data > val) {
            root.left = delete(root.left, val);
        } 
        // If value is equal to root's value, then this is the node to be deleted
        else {
            // Case 1: Node is a leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Node has one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Node has two children, replace with inorder successor
            Node_Structure successor = findInOrderSuccessor(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    // Function to find the inorder successor (smallest value in the right subtree)
    public static Node_Structure findInOrderSuccessor(Node_Structure root) {
        Node_Structure current = root;

        // Go to the leftmost child
        while (current != null && current.left != null) {
            current = current.left;
        }

        return current;
    }
}
