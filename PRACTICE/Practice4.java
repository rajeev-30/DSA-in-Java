package PRACTICE;

class Stack11 {
    int arr[];
    int top;
    int size;

    Stack11(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack is overFlow");
            return;
        }
        top++;
        arr[top] = data;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is underFlow");
            return;
        }
        top--;
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(arr[top]);
    }
}

public class Practice4 {
    public static void main(String[] args) {
        Stack11 s = new Stack11(4);
        s.push(2);
        s.push(3);
        s.push(3);

        s.pop();
        s.pop();
        s.pop();

        s.push(33);
        s.peek();
    }

}
