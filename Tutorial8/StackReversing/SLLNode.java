package Tutorial8.StackReversing;
public class SLLNode {

    private int data;
    private SLLNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


    public SLLNode getNext() {
        return next;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }

    public SLLNode(int data){
        this.data = data;
        this.next = null;
    }

    
}