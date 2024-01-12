// package BINARY_SEARCH_TREES;

class node3 {
    int data;
    node3 left;
    node3 right;

    node3(int data) {
        this.data = data;
        left = null;
        right = null;
    }

}

public class Deletion_in_BST {

    // inOrder traversal
    public static void inOrder(node3 root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static node3 deletion(node3 root, int value) {
        if (root == null) {
            return root;
        }
        if (value < root.data) {
            root.left = deletion(root.left, value);
        } else if (value > root.data) {
            root.right = deletion(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deletion(root.right, root.data);
        }

        return root;
    }

    // find min value
    public static int minValue(node3 root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    public static void main(String[] args) {
        node3 n = new node3(9);
        node3 n1 = new node3(4);
        node3 n2 = new node3(11);
        node3 n3 = new node3(2);
        node3 n4 = new node3(7);
        node3 n5 = new node3(15);
        node3 n6 = new node3(5);
        node3 n7 = new node3(8);
        node3 n8 = new node3(14);

        node3 root = n;
        root.left = n1;
        root.right = n2;

        n1.left = n3;
        n1.right = n4;

        n2.right = n5;

        n4.left = n6;
        n4.right = n7;

        n5.left = n8;

        inOrder(root);
        deletion(root, 11);
        System.out.println();
        inOrder(root);
    }

}
