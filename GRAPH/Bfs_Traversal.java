package GRAPH;

class Queue {
    int arr[];
    int size;
    int rear;
    int front;

    Queue(int n) {
        size = n;
        arr = new int[size];
        rear = -1;
        front = 0;
    }

    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue OverFlow!");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    int dequeue(Queue q) {
        int a = -1;
        if (empty()) {
            System.out.println("Queue UnderFlow!");
        } else {
            q.front++;
            a = q.arr[q.front];
        }
        return a;
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

    boolean empty() {
        return rear == -1;
    }
}

public class Bfs_Traversal {
    public static void main(String[] args) {
        Queue q = new Queue(400);
        int node;
        int i = 1;
        int visited[] = { 0, 0, 0, 0, 0, 0, 0 };
        int a[][] = {
                { 0, 1, 1, 1, 0, 0, 0 },
                { 1, 0, 0, 1, 0, 0, 0 },
                { 1, 1, 0, 1, 1, 0, 0 },
                { 1, 0, 1, 0, 1, 0, 0 },
                { 0, 0, 1, 1, 0, 1, 1 },
                { 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0 }, 
        };
        
        System.out.println(i);
        visited[i] = 1;
        q.enqueue(i);

        while (!q.empty()) {
            node = q.dequeue(q);

            for (int j = 0; j < 7; j++) {
                if (a[node][j] == 1 && visited[j] == 0) {
                    System.out.println(j);
                    visited[j] = 1;
                    q.enqueue(j);
                }
            }
        }
    }

}
