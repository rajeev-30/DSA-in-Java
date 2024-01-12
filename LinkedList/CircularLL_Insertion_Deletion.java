package LinkedList;

class Node16 {
    int data;
    Node16 next;

    Node16(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLL_Insertion_Deletion {

    public static void traverseal(Node16 head) {
        Node16 curr = head;
        do {
            System.out.println(curr.data);
            curr = curr.next;
        } while (curr != head);

    }

    // Insertion
    public static Node16 insertion(Node16 head, int data, int pos) {

        Node16 toAdd = new Node16(data);
        Node16 curr = head;
        // insert first
        while (curr.next != head) {
            curr = curr.next;
        }

        if (pos == 0) {
            toAdd.next = head;
            curr.next = toAdd;
            return toAdd;
        }

        // insert At given position
        Node16 p = head;
        for (int i = 0; i < pos - 1; i++) {
            p = p.next;
        }
        toAdd.next = p.next;
        p.next = toAdd;
        return head;
    }

    // Deletion
    public static Node16 deletion(Node16 head, int pos) {
        // delete first
        Node16 curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }

        if (pos == 0) {
            curr.next = head.next;
            head = head.next;
            return head;
        }

        // Delete the given position
        Node16 p = head;
        for (int i = 0; i < pos - 1; i++) {
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node16 n1 = new Node16(1);
        Node16 n2 = new Node16(2);
        Node16 n3 = new Node16(3);
        Node16 n4 = new Node16(4);

        Node16 head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = head;

        // head = insertion(head, 11, 0);
        head = deletion(head, 3);
        traverseal(head);
    }

}
