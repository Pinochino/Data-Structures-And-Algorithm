package Tutorial8.StackReversing;

public class ArrayQueue {
    private int front;
    private int rear;
    private int[] q;
    private int maxSize;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        q = new int[maxSize];
        front = 0;
        rear = 0;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public void enqueue(int item) {
        if (!isFull()) {
            q[rear] = item;
            rear = (rear + 1) % maxSize;
        } else {
            System.out.println("Queue is full");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int pos = q[front];
            front = (front + 1) % maxSize;
            return pos;
        } else {
            System.out.println("Queue is empty");
            return -1;
        }
    }
}
