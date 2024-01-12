package LinkedList;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insertion_LL {
    // Traversal
    static void print(Node1 head) {
        Node1 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }

    }

    // instertion
    static void insertNode(Node1 head, int data, int pos) {
        Node1 toAdd = new Node1(data);
        if (pos == 0) {
            toAdd.next = head;
            head = toAdd;
            return;
        }
        Node1 prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }

        toAdd = prev.next;
        prev.next = toAdd;

    }

    public static void main(String[] args) {
        Node1 n1 = new Node1(10);
        Node1 n2 = new Node1(20);
        Node1 n3 = new Node1(30);
        Node1 n4 = new Node1(40);

        Node1 head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        insertNode(head, 309, 2);
        print(head);
    }

}
