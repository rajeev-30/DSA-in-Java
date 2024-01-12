package BINARY_TREE;

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

public class postOrder_Traversal {
    public static void postOrder(node2 root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

    public static void main(String[] args) {
        node2 n = new node2(4);
        node2 n1 = new node2(1);
        node2 n2 = new node2(6);
        node2 n3 = new node2(5);
        node2 n4 = new node2(2);

        node2 root = n;
        root.left = n1;
        root.right = n2;

        n1.left = n3;
        n1.right = n4;

        postOrder(root);

    }

}
