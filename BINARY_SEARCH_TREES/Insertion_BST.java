// package BINARY_SEARCH_TREES;

class node2 {
    int data;
    node2 left;
    node2 right;

    node2(int data) {
        this.data = data;
        left = null;
        right = null;
    }

}

public class Insertion_BST {

    public static void inOrder(node2 root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public static void Insertion(node2 root, int el) {
        node2 prev = null;
        while (root != null) {
            prev = root;
            if (el == root.data) {
                System.out.println("Cannot insert coz of duplicate node!");
                return;
            } else if (el < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        node2 n = new node2(el);

        if (el < prev.data) {
            prev.left = n;
        } else {
            prev.right = n;
        }
    }

    public static void main(String[] args) {
        node2 n = new node2(9);
        node2 n1 = new node2(4);
        node2 n2 = new node2(11);
        node2 n3 = new node2(2);
        node2 n4 = new node2(7);
        node2 n5 = new node2(15);
        node2 n6 = new node2(5);
        node2 n7 = new node2(8);
        node2 n8 = new node2(14);

        node2 root = n;
        root.left = n1;
        root.right = n2;

        n1.left = n3;
        n1.right = n4;

        n2.right = n5;

        n4.left = n6;
        n4.right = n7;

        n5.left = n8;

        Insertion(root, 12);
        inOrder(root);
    }

}
