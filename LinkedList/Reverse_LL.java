package LinkedList;

class Node13 {
    int data;
    Node13 next;

    Node13(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Reverse_LL {

    public static void traverse(Node13 head) {
        Node13 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static Node13 reverse(Node13 head) {
        if (head.next == null) {
            return head;
        }
        Node13 prev = head;
        Node13 curr = head.next;
        while (curr != null) {
            Node13 next = curr.next;

            // reverse logic
            curr.next = prev;

            // update
            prev = curr;
            curr = next;

        }
        head.next = null;
        head = prev;
        return head;

    }

    public static void main(String[] args) {
        Node13 n1 = new Node13(1);
        Node13 n2 = new Node13(2);
        Node13 n3 = new Node13(3);
        Node13 n4 = new Node13(4);

        Node13 head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        head = reverse(head);
        traverse(head);
    }

}
