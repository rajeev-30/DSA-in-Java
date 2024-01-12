package PRACTICE;

class stackk {
    int[] arr;
    int size;
    int top;

    stackk(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack overFlow!");
            return;
        }
        top++;
        arr[top] = data;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack underFlow!");
            return;
        }
        top--;
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println(arr[top]);
    }

    boolean isEmpty() {
        return top == -1;
    }

    void isFull() {
        if (top == size - 1) {
            System.out.println("Stack is full");
            return;
        }
        int ptr = (size - 1) - top;
        System.out.println(ptr + " more elements can be added in stack");
    }
}

public class Practice {
    public static void main(String[] args) {
        // Implementing stack using array :)
        stackk s = new stackk(19);
        s.push(1);
        s.push(2);
        s.push(2);
        s.push(2);
        s.push(2);
        s.push(2);
        s.isFull();
    }

}
