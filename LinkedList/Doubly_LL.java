package LinkedList;

class Node15 {
    int data;
    Node15 prev;
    Node15 next;

    Node15(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Doubly_LL {

    public static void traverse(Node15 head) {
        Node15 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void reverseTraverse(Node15 head) {
        Node15 p = head;
        while (p.next != null) {
            p = p.next;
        }

        while (p != null) {
            System.out.println(p.data);
            p = p.prev;
        }
    }

    public static void main(String[] args) {
        Node15 n1 = new Node15(1);
        Node15 n2 = new Node15(2);
        Node15 n3 = new Node15(3);
        Node15 n4 = new Node15(4);

        Node15 head = n1;
        head.next = n2;
        head.prev = null;

        n2.next = n3;
        n2.prev = head;

        n3.next = n4;
        n3.prev = n2;

        n4.next = null;
        n4.prev = n3;

        System.out.println("Traversal");
        traverse(head);
        System.out.println("Reverse Traversal");
        reverseTraverse(head);
    }

}
