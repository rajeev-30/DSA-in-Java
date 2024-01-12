package LinkedList;

class Node11 {
    int data;
    Node11 next;

    Node11(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LL_LinkedList {

    public static void traverse(Node11 head) {

        Node11 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node11 n1 = new Node11(10);
        Node11 n2 = new Node11(20);
        Node11 n3 = new Node11(30);

        Node11 head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;

        traverse(head);
    }

}
