package Tutorial8.StackReversing;

public class ArrayQueue {

    private int front;
    private int rear;
    private StackNode[] q;
    private final int maxSize;

    public ArrayQueue(){
        maxSize = 100;
        q = new StackNode[maxSize];
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public StackNode[] getQ() {
        return q;
    }

    public void setQ(StackNode[] q) {
        this.q = q;
    }

    public int getMaxSize() {
        return maxSize;
    }
    
    public boolean isEmpty(){
        return front == rear;
    }

    public boolean isFull(){
        return rear == (front - 1 + maxSize) % maxSize;
    }

    public void enqueue(StackNode i){
        if (!isFull()) {
            q[rear] = i;
            rear = (rear + 1) % maxSize;
        }
    }

    public StackNode dequeue(){
        if (!isEmpty()) {
            StackNode dequeuedElement = q[front];
            front = (front + 1) % maxSize;
            return dequeuedElement;
        }
        return null; // Returning null to indicate underflow, or you can throw an exception
    }

   
}
