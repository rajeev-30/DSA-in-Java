package PRACTICE;

class Stack1 {
    int[] arr;
    int top;
    int size;

    Stack1(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack is overflow");
            return;
        }
        top++;
        arr[top] = data;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is underflow");
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

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Stack1 s = new Stack1(3);
        s.push(11);
        s.push(12);
        s.push(13);
        s.pop();
        s.peek();
    }

}
