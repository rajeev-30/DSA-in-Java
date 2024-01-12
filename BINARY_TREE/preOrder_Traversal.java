package BINARY_TREE;

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

public class preOrder_Traversal {
    public static void preOrder(node1 root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        node1 n = new node1(4);
        node1 n1 = new node1(1);
        node1 n2 = new node1(6);
        node1 n3 = new node1(5);
        node1 n4 = new node1(2);

        node1 root = n;
        root.left = n1;
        root.right = n2;

        n1.left = n3;
        n1.right = n4;

        preOrder(root);

    }

}
