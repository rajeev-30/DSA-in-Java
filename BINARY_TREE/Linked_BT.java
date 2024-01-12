package BINARY_TREE;

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

public class Linked_BT {
    public static void main(String[] args) {
        node n = new node(1);
        node n1 = new node(2);
        node n2 = new node(3);

        // Lnking the root node with left and right children
        n.left = n1;
        n.right = n2;
    }

}
