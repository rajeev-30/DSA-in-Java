class Node33 {
    int data;
    Node33 next;
    Node33 rear;
    Node33 front;

    Node33() {
        next = null;
        front = null;
        rear = null;
    }

    void enqueue(int data) {
        Node33 n = new Node33();
        n.data = data;
        if (rear == null) {
            n.next = null;
            rear = n;
            front = n;
            return;
        }
        n.next = null;
        rear.next = n;
        rear = n;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }
        front = front.next;

    }

    void Back() {
        if (rear == null) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println(rear.data);
    }

    void Front() {
        if (rear == null) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println(front.data);
    }
}

public class Q3_LL {

    public static void main(String[] args) {

        Node33 n = new Node33();
        n.enqueue(1);
        n.enqueue(2);
        n.enqueue(33);
        n.enqueue(4);
        n.enqueue(44);

        n.dequeue();
        n.dequeue();

        n.Front();
        n.Back();

    }

}
