package Tutorial8.StackReversing;

public class StackReversing {
    private ArrayQueue q;
    public ArrayQueue getQ() {
        return q;
    }

    public void setQ(ArrayQueue q) {
        this.q = q;
    }

    private SLLStack s;

    public SLLStack getS() {
        return s;
    }

    public void setS(SLLStack s) {
        this.s = s;
    }

    public StackReversing() {
        q = new ArrayQueue(100);
        s = new SLLStack();
    }

    public void reverse(ArrayQueue a, SLLStack b) {
        int x;
        while(!b.isEmpty()){
            x = b.pop().getData();
            a.enqueue(x);
        }
        while (!a.isEmpty()){
            x = a.dequeue();
            b.push(new SLLNode(x));
        }
    }

   public static void main(String[] args) {
    ArrayQueue arrayQueue = new ArrayQueue(100);
    SLLStack sllStack = new SLLStack();
    SLLNode c = new SLLNode(1);
    SLLNode d = new SLLNode(2);
    SLLNode e = new SLLNode(3);
    sllStack.push(c);
    sllStack.push(d);
    sllStack.push(e);
    StackReversing stackReversing = new StackReversing();
    SLLStack reversedStack = stackReversing.reverse(arrayQueue, sllStack);
    // Print the reversed stack
    while (!reversedStack.isEmpty()) {
        System.out.print(reversedStack.pop().getData() + " ");
    }
}

// Modify the reverse method to return the reversed stack
public SLLStack reverse(ArrayQueue a, SLLStack b) {
    int x;
    while (!b.isEmpty()) {
        x = b.pop().getData();
        a.enqueue(x);
    }
    while (!a.isEmpty()) {
        x = a.dequeue();
        b.push(new SLLNode(x));
    }
    return b; // Return the reversed stack
}

    
}