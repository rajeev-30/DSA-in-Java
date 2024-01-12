package PRACTICE;

class Stack2 {
    int data;
    Stack2 next;
    Stack2 top;

    Stack2() {
        next = null;
        top = null;
    }

    void push(int data) {
        Stack2 n = new Stack2();
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
            System.out.println("Stack is underFlow!");
            return;
        }
        top = top.next;
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.println(top.data);
    }
}

public class Practice3 {

    public static void traverse(Stack2 head) {
        Stack2 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

    }

}
