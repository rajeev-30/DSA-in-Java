package QUEUE;

class Queue {
    int arr[];
    int size;
    int rear;

    Queue(int n) {
        size = n;
        arr = new int[size];
        rear = -1;
    }

    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue OverFlow!");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    void dequeue() {
        if (rear == -1) {
            System.out.println("Queue UnderFlow!");
            return;
        }
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
    }

    void front() {
        if (rear == -1) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.println(arr[0]);
    }

    void back() {
        if (rear == -1) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.println(arr[rear]);
    }
}

public class Using_Arr {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);

        // q.dequeue();
        // q.dequeue();
        // q.dequeue();

        // q.enqueue(45);
        // q.enqueue(458);

        q.front();
        q.back();
    }

}
