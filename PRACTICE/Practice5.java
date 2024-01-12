package PRACTICE;

class Stack12 {
    int data;
    Stack12 next;
    Stack12 top;

    Stack12() {
        next = null;
        top = null;
    }

    void push(int data) {
        Stack12 n = new Stack12();
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
            System.out.println("Stack UnderFlow!");
            return;
        }
        top = top.next;
    }

    void top() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(top.data);
    }

}

public class Practice5 {
    public static void main(String[] args) {
        Stack12 s = new Stack12();
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);

        // s.pop();
        s.top();
    }

}
