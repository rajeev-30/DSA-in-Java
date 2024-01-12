package LinkedList;

class Node18 {
    int data;
    Node18 next;
    Node18 prev;

    Node18(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLL_Insertion_Deletion {

    // Traversal
    public static void traversal(Node18 head) {
        Node18 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    // Reverse Traversal
    public static void reverseTraverse(Node18 head) {
        Node18 p = head;
        while (p.next != null) {
            p = p.next;
        }

        while (p != null) {
            System.out.println(p.data);
            p = p.prev;
        }
    }

    // Insertion
    public static Node18 insertion(Node18 head, int data, int pos) {
        Node18 toAdd = new Node18(data);
        if (pos == 0) {
            toAdd.next = head;
            head.prev = toAdd;
            toAdd.prev = null;
            return toAdd;
        }
        Node18 p = head;
        for (int i = 0; i < pos; i++) {
            p = p.next;
        }

        toAdd.prev = p.prev;
        p.prev.next = toAdd;

        toAdd.next = p;
        p.prev = toAdd;

        return head;
    }

    // Insert At Last
    public static Node18 insertAtLast(Node18 head, int data, int pos) {
        Node18 toAdd = new Node18(data);
        Node18 p = head;
        while (p.next != null) {
            p = p.next;
        }
        toAdd.next = p.next;
        toAdd.prev = p;

        p.next = toAdd;
        return head;

    }

    // Deletion
    public static Node18 deletion(Node18 head, int pos) {
        if (pos == 0) {
            head = head.next;
            head.prev = null;
            return head;
        }
        Node18 p = head;
        for (int i = 0; i < pos - 1; i++) {
            p = p.next;
        }
        Node18 temp = p.next.next;
        p.next = temp;
        temp.prev = p;
        return head;
    }

    // Deletion Last node
    public static Node18 deleteLast(Node18 head, int pos) {
        Node18 p = head;
        while (p.next.next != null) {
            p = p.next;
        }
        p.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node18 n1 = new Node18(1);
        Node18 n2 = new Node18(2);
        Node18 n3 = new Node18(3);
        Node18 n4 = new Node18(4);

        Node18 head = n1;
        head.next = n2;
        head.prev = null;

        n2.next = n3;
        n2.prev = head;

        n3.next = n4;
        n3.prev = n2;

        n4.next = null;
        n4.prev = n3;

        // head = insertion(head, 11, 1);
        // head = insertAtLast(head, 11, 4);

        // head = deletion(head, 2);
        head = deleteLast(head, 3);

        traversal(head);
        System.out.println("reverse: ");
        reverseTraverse(head);
    }

}
