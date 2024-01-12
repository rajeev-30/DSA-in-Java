package STACK;

class Stack {

    int arr[];
    int top;
    int n; // size of an array

    Stack(int size) {
        this.n = size;
        arr = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == n - 1) {
            System.out.println("stack overFlow");
            return;
        }
        top++;
        arr[top] = data;
    }

    void pop() {
        if (top == -1) {
            System.out.println("stack underFlow");
            return;
        }
        top--;
    }

    void peek() {
        if (top == -1) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println(arr[top]);
    }

    boolean empty() {
        return top == -1;
    }

    // traverse
    void traverse() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }

    }
}

public class Array_Stack {

    public static void main(String[] args) {
        // Implementing Stack using array :)
        Stack s = new Stack(3);
        s.push(1);
        s.push(2);
        s.push(3);

        // System.out.print("top element: ");
        // s.peek();
        // s.pop();
        // s.peak();
        // s.traverse();
        // System.out.println(s.empty());
    }

}
