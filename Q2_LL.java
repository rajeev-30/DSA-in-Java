class Node22 {
    int data;
    Node22 next;

    Node22(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q2_LL {

    public static void traversal(Node22 head) {
        Node22 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    static Node22 deleteMiddle(Node22 head) {
        Node22 curr = head;

        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        int middle = size / 2;
        Node22 prev = head;
        for (int i = 1; i < middle; i++) {
            prev = prev.next;
        }
        System.out.println("middle: " + prev.next.data);
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node22 n1 = new Node22(1);
        Node22 n2 = new Node22(2);
        Node22 n3 = new Node22(3);
        Node22 n4 = new Node22(4);
        Node22 n5 = new Node22(5);
        Node22 n6 = new Node22(6);
        Node22 n7 = new Node22(7);

        Node22 head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = null;

        head = deleteMiddle(head);
        traversal(head);

    }

}
