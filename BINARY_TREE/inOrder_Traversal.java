package BINARY_TREE;

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

public class inOrder_Traversal {
    public static void inOrder(node3 root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        node3 n = new node3(1);
        node3 n1 = new node3(2);
        node3 n2 = new node3(3);
        node3 n3 = new node3(4);
        node3 n4 = new node3(5);
        node3 n5 = new node3(6);
        node3 n6 = new node3(7);
        node3 n7 = new node3(8);
        node3 n8 = new node3(9);
        node3 n9 = new node3(10);

        node3 root = n;
        root.left = n1;
        root.right = n2;

        n1.left = n3;
        n1.right = n4;

        n2.left = n5;
        n2.right = n6;

        n3.left = n7;
        n3.right = n8;

        n4.right = n9;

        /*
         * ,1
         * / \
         * 2 , 3
         * /\, /\
         * 4 5 6 7
         * /\ \
         * 8 9 10
         * 
         */

        inOrder(root);

    }

}

/*
 * 1
 * / \
 * 2 3
 * / \ / \
 * 4 5 6 7
 * / \ \
 * 8 9 10
 * 
 */