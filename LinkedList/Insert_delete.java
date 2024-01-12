package LinkedList;

class List {
    int data;
    List next;

    List(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insert_delete {

    public static void traverse(List head) {
        List curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static List insertAtFirst(List head, int data) {
        List toAdd = new List(data);
        toAdd.next = head;
        return toAdd;
    }

    public static List insertAtindex(List head, int data, int pos) {
        List toAdd = new List(data);
        List p = head;
        for (int i = 0; i < pos - 1; i++) {
            p = p.next;
        }
        toAdd.next = p.next;
        p.next = toAdd;
        return head;

    }

    public static List insertAfterNode(List head, List prev, int data) {
        List toAdd = new List(data);
        toAdd.next = prev.next;
        prev.next = toAdd;
        return head;
    }

    public static List deleteFirst(List head) {
        head = head.next;
        return head;
    }

    public static List deleteIndex(List head, int pos) {
        List p = head;
        for (int i = 0; i < pos - 1; i++) {
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }

    public static void main(String[] args) {
        List l1 = new List(1);
        List l2 = new List(2);
        List l3 = new List(3);

        List head = l1;
        head.next = l2;
        l2.next = l3;
        l3.next = null;

        // head = insertAtFirst(head, 11);
        // head = insertAtindex(head, 11, 3);

        // head = deleteFirst(head);
        // head = deleteIndex(head, 2);
        head = insertAfterNode(head, l1, 11);
        traverse(head);
    }

}
