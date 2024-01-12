package QUEUE;

class QueueLL {
    int data;
    QueueLL next;
    QueueLL rear;
    QueueLL front;

    QueueLL() {
        next = null;
        rear = null;
        front = null;

    }

    void add(int data) {
        QueueLL n = new QueueLL();
        n.data = data;
        if (front == null) {
            n.next = null;
            rear = n;
            front = n;
            return;
        }

        rear.next = n;
        n.next = null;
        rear = n;
    }

    void remove() {
        if (front == null) {
            System.out.println("Queue is UnderFlow!");
            return;
        }
        front = front.next;
    }

    void peek() {
        if (front == null) {
            System.out.println("Queue is UnderFlow!");
            return;
        }
        System.out.println(front.data);
    }

    void Back() {
        if (rear == null) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println(rear.data);
    }

    boolean empty() {
        return front == null;
    }
}

public class Using_LL {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.add(1);
        q.add(2);
        q.add(3);

        q.remove();

        q.peek();
        q.Back();
    }

}
