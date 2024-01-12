package LinkedList;

class Node12 {
    int data;
    Node12 next;

    Node12(int data) {
        this.data = data;
        this.next = null;
    }

}

public class Search {

    public static void traverse(Node12 head) {
        int size = 0;
        Node12 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
            size++;
        }
        // System.out.println("LL size is: " + size);
    }

    public static void search(Node12 head, int data, int pos) {
        Node12 p = head;
        boolean b = true;
        for (int i = 0; i < pos; i++) {
            if (p.data == data) {
                System.out.println("yes, this Node present in LL at " + i + " index");
                b = false;
                break;
            }
            p = p.next;
        }
        if (b)
            System.out.println("No! this Node not present in LL");

    }

    public static void main(String[] args) {
        Node12 n1 = new Node12(1);
        Node12 n2 = new Node12(2);
        Node12 n3 = new Node12(3);
        Node12 n4 = new Node12(4);

        Node12 head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        // search(head, 31, 4);
        traverse(head);
    }

}
