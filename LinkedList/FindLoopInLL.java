package LinkedList;

class Node21 {
    int data;
    Node21 next;

    Node21(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FindLoopInLL {
    // Traversal
    static void print(Node21 head) {
        Node21 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }

    }

    // Find Loop in list
    static void findCycle(Node21 head) {
        Node21 slow = head;
        Node21 fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                System.out.println("This list is a Cycle");
                return;
            }
        }
        System.out.println("This list is not a Cycle");
    }

    public static void main(String[] args) {
        Node21 n1 = new Node21(10);
        Node21 n2 = new Node21(20);
        Node21 n3 = new Node21(30);
        Node21 n4 = new Node21(40);

        Node21 head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n3;

        // print(head);
        findCycle(head);
    }

}
