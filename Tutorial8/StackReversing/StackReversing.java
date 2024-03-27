package Tutorial8.StackReversing;
public class StackReversing {

    private ArrayQueue q;
    private SLLStack s;
    public ArrayQueue getQ() {
        return q;
    }
    public void setQ(ArrayQueue q) {
        this.q = q;
    }
    public SLLStack getS() {
        return s;
    }
    public void setS(SLLStack s) {
        this.s = s;
    }

    public SLLStack reverse(ArrayQueue q, SLLStack s) {
        while (!s.isEmpty()) {
            q.enqueue(s.pop());
        }
        while (!q.isEmpty()) {
            s.push(q.dequeue());
        }
        return s;
    }

    public static void main(String[] args) {
        ArrayQueue a = new ArrayQueue();
        SLLStack b = new SLLStack();
        
        StackNode node1 = new StackNode();
        node1.setData(4);
        a.enqueue(node1);
        
        StackNode node2 = new StackNode();
        node2.setData(2);
        a.enqueue(node2);
        
        StackNode node3 = new StackNode();
        node3.setData(3);
        a.enqueue(node3);
        
        StackNode node4 = new StackNode();
        node4.setData(1);
        a.enqueue(node4);
    
        StackReversing stackReversing = new StackReversing();
        SLLStack result = stackReversing.reverse(a, b);
    
        while (!result.isEmpty()) {
            System.out.println(result.pop().getData());
        }
    }
    
    
}