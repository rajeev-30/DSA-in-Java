package LinkedList;

class Node14 {
    int data;
    Node14 next;

    Node14(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Circular_LL {

    public static void traverse(Node14 head) {
        Node14 curr = head;

        do {
            System.out.println(curr.data);
            curr = curr.next;
        } while (curr != head);

    }

    public static void main(String[] args) {
        Node14 n1 = new Node14(1);
        Node14 n2 = new Node14(2);
        Node14 n3 = new Node14(3);
        Node14 n4 = new Node14(4);

        Node14 head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = head;

        traverse(head);
    }

}
