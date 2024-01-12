package LinkedList;

class NOde {
    int data;
    NOde next;

    NOde(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insertion_Deletion {

    public static void traverse(NOde head) {
        NOde curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static NOde insert(NOde head, int data, int pos) {
        NOde toAdd = new NOde(data);
        if (pos == 0) {
            toAdd.next = head;
            return toAdd;
        }
        NOde p = head;
        for (int i = 0; i < pos - 1; i++) {
            p = p.next;
        }
        toAdd.next = p.next;
        p.next = toAdd;
        return head;
    }

    public static NOde delete(NOde head, int pos) {
        if (pos == 0) {
            head = head.next;
            return head;
        }
        NOde p = head;
        for (int i = 0; i < pos - 1; i++) {
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }

    static NOde deteleByData(NOde head, int data) {
        NOde curr = head;
        while (curr.next != null) {

            if (head.data == data) { // check first node
                head = head.next;
                return head;
            }

            else if (curr.next.data == data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        NOde n1 = new NOde(1);
        NOde n2 = new NOde(2);
        NOde n3 = new NOde(3);
        NOde n4 = new NOde(4);

        NOde head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        // head = insert(head, 11, 4);
        // head = delete(head, 3);
        head = deteleByData(head, 5);
        traverse(head);
    }

}
