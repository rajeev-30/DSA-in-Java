// package BINARY_SEARCH_TREES;

class node {
    int data;
    node left;
    node right;

    node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

}

public class First_Binary_SerchTree {

    public static void inOrder(node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    // public static int isBST(node root) {
    // node prev = null;
    // if (root != null) {
    // if (isBST(root.left)) {
    // return 0;
    // }
    // if (prev != null && root.data <= prev.data) {
    // return 0;
    // }
    // prev = root;
    // return isBST(root.right);

    // } else {
    // return 1;
    // }
    // }

    public static void main(String[] args) {

        // program to check whether given tree is binary search tree or not;

        // Trick to ckeck BST :- inOrder traversal of a BST gives an ascending order
        // sorted nodes;

        /*
         * Properties of BST
         * (i) All nodes of the left subtree are lesser than root
         * (ii) All nodes of the left subtree are greater than root
         * (ii) there are no duplicate nodes
         * 
         */

        node n = new node(9);
        node n1 = new node(4);
        node n2 = new node(11);
        node n3 = new node(2);
        node n4 = new node(7);
        node n5 = new node(15);
        node n6 = new node(5);
        node n7 = new node(8);
        node n8 = new node(15);

        node root = n;
        root.left = n1;
        root.right = n2;

        n1.left = n3;
        n1.right = n4;

        n2.right = n5;

        n4.left = n6;
        n4.right = n7;

        n5.left = n8;

        inOrder(root);

    }

}
