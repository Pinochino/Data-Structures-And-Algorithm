package Tutorial8.StackReversing;
public class SLLStack {

    private StackNode top;

    public StackNode getTop() {
        return top;
    }

    public void setTop(StackNode top) {
        this.top = top;
    }
    
    public boolean isEmpty(){
        return top == null;
    }

    public void push(StackNode newNode){
        newNode.setNext(top);
        top = newNode;
    }

    public StackNode pop(){
        if (!isEmpty()) {
            StackNode topNode = top;
            top = top.getNext();
            return topNode;
        } else {
            return null; // Stack is empty, return null
        }
    }

    public StackNode peek(){
        return top; // Return the top node without popping it
    }
}