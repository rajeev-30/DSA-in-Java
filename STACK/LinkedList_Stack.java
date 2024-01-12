package STACK;

class StackLL {
    int data;
    StackLL next;
    StackLL top;

    StackLL() {
        next = null;
        top = null;
    }

    void push(int data) {
        StackLL n = new StackLL();
        n.data = data;
        if (top == null) {
            n.next = null;
            top = n;
            return;
        }

        n.next = top;
        top = n;
    }

    void pop() {
        if (top == null) {
            System.out.println("LL underFlow");
            return;
        }
        top = top.next;
    }

    void peek() {
        if (top == null) {
            System.out.println("LL is empty!");
            return;
        }
        System.out.println(top.data);
    }

    boolean empty() {
        return top == null;
    }

    // traversal
    void traverse() {
        StackLL curr = top;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}

public class LinkedList_Stack {
    public static void main(String[] args) {
        // Stack implementing using LinkedList
        StackLL s = new StackLL();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.pop();
        s.pop();

        s.pop();
        s.peek();

        System.out.println(s.empty());
        // s.traverse();
    }

}
