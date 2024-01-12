package LinkedList;

class Node17 {
    int data;
    Node17 next;

    Node17(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Reverse_CircularLL {

    public static void traverse(Node17 head) {
        Node17 curr = head;

        do {
            System.out.println(curr.data);
            curr = curr.next;
        } while (curr != head);

    }

    public static Node17 reverse(Node17 head) {
        Node17 prev = head;
        Node17 curr = head.next;

        while (curr != head) {
            Node17 next = curr.next;

            // reverse
            curr.next = prev;

            // update
            prev = curr;
            curr = next;
        }
        head.next = prev;
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        Node17 n1 = new Node17(1);
        Node17 n2 = new Node17(2);
        Node17 n3 = new Node17(3);
        Node17 n4 = new Node17(4);

        Node17 head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = head;

        head = reverse(head);
        traverse(head);
    }

}
