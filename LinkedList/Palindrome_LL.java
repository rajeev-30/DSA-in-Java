package LinkedList;

class nodee {
    int data;
    nodee next;

    nodee(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Palindrome_LL {
    // traversal
    public static void traverse(nodee head) {
        nodee curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    // find middle
    static nodee middle(nodee head) {
        nodee slow = head;
        nodee fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // reverse the second half
    static nodee reverse(nodee head) {
        nodee newHead = middle(head);

        if (newHead.next == null) {
            return null;
        }

        nodee prev = null;
        nodee curr = newHead.next;
        while (curr != null) {
            nodee next = curr.next;
            // reverse
            curr.next = prev;
            // update
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // check LinkedList is palindrome or not;
    static void isPalindrome(nodee head) {
        nodee firstHalf = head;
        nodee secondHalf = reverse(head); // this half is reverse

        if (firstHalf.next == null) {
            System.out.println("This LinkedLst is not palindrome!");
            return;
        }

        while (secondHalf != null) {
            if (secondHalf.data != firstHalf.data) {
                System.out.println("This LinkedLst is not palindrome!");
                return;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        System.out.println("This LinkedLst is palindrome");
    }

    public static void main(String[] args) {
        nodee n1 = new nodee(1);
        nodee n2 = new nodee(2);
        nodee n3 = new nodee(3);
        nodee n4 = new nodee(2);
        nodee n5 = new nodee(1);

        nodee head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        // nodee print = middle(head);
        // System.out.println(print.data);

        // head = reverse(head);
        // traverse(head);

        isPalindrome(head);
    }

}
