class Node111 {
    int data;
    Node111 next;

    Node111(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q1_LL {

    public static void traversal(Node111 head) {
        Node111 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static Node111 deletion(Node111 head, int pos) {

        int size = 0;
        Node111 curr = head;

        while (curr != null) {
            size++;
            curr = curr.next;
        }
        if (pos == size) {
            return head.next; /// this code is not working
        }
        Node111 prev = head;
        int NodePos = (size - pos) + 1;
        for (int i = 1; i < NodePos - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        // Search and delete nth Node from the last of linked list;
        Node111 n1 = new Node111(1);
        Node111 n2 = new Node111(2);
        Node111 n3 = new Node111(3);
        Node111 n4 = new Node111(4);

        Node111 head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        deletion(head, 4);// pass head and element no.
        traversal(head);
    }

}
