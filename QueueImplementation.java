class Queue {
    int data[];
    int front;
    int rear;
    int size;

    public Queue(int len) {
        data = new int[len];
        front = rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return rear == data.length;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty..");
        }
        return data[front];
    }

    void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        if (size == 0) {
            front++;
        }
        size++;
        data[++rear] = element;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty..");
        }
        int temp = data[front];
        front++;
        size--;
        if (size == 0) {
            front = rear = -1;
        }
        return temp;
    }
}

public class QueueImplementation {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}
