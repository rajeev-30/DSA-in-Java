package PRACTICE;

class stacck {
    int data;
    stacck next;
    stacck top;

    stacck() {
        next = null;
        top = null;
    }

    void push(int data) {
        stacck n = new stacck();
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
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println(top.data);
    }

    boolean isEmpty() {
        return top == null;
    }

}

public class Practice1 {
    public static void main(String[] args) {
        // Implementing Stack using LinkedList :)
        stacck s = new stacck();
        s.push(1);
        s.push(2);
        s.pop();
        s.pop();
        s.peek();
    }

}
