import javax.print.attribute.standard.RequestingUserName;

// package BINARY_SEARCH_TREES;

class node1 {
    int data;
    node1 left;
    node1 right;

    node1(int data) {
        this.data = data;
        left = null;
        right = null;
    }

}
class mode{
    /**
     * InnerSearching_in_BST
     */
    public record InnerSearching_in_BST() {
    }
    
}
public class Searching_in_BST {

    // using non recursion
    public static void Searching(node1 root, int el) {
        if (root == null)
            return;

        while (root != null) {
            if (root.data == el) {
                System.out.println("Element found: " + root.data);
                return;
            } else if (el > root.data) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        System.out.println("Element not found!");
    }

    // using recursion
    public static node1 searchingUsingRecur(node1 root, int el) {
        if (root == null)
            return null;

        if (root.data == el) {
            return root;
        } else if (el > root.data) {
            return searchingUsingRecur(root.right, el);
        } else {
            return searchingUsingRecur(root.left, el);
        }
    }

    public static void main(String[] args) {
        node1 n = new node1(9);
        node1 n1 = new node1(4);
        node1 n2 = new node1(11);
        node1 n3 = new node1(2);
        node1 n4 = new node1(7);
        node1 n5 = new node1(15);
        node1 n6 = new node1(5);
        node1 n7 = new node1(8);
        node1 n8 = new node1(14);

        node1 root = n;
        root.left = n1;
        root.right = n2;

        n1.left = n3;
        n1.right = n4;

        n2.right = n5;

        n4.left = n6;
        n4.right = n7;

        n5.left = n8;
        System.out.println("Using non recursion: ");
        Searching(root, 2);

        System.out.println("Using recursion: ");
        node1 e = searchingUsingRecur(root, 2);
        if (e != null)
            System.out.println("Element found: " + e.data);
        else
            System.out.println("Element not found!");
    }

}
