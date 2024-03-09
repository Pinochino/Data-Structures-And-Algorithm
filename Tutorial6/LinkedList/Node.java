// package myLinkedList;
// public class Node extends LinkedList{
//         int value;
//         Node next;
//         Node(int value){
//             this.value = value;
//         }
//         public static void main(String[] args) {
//             Node n1 = new Node(1);
//             Node n2 = new Node(2);
//             Node n3 = new Node(3);
    
//             n1.next = n2;
//             n2.next = n3;
    
//             printLinkedList(n1);
//             // printLinkedList(n2);
//             // printLinkedList(n3);
//         n1 = removeAtIndex(n1, 0);
//         printLinkedList(n1);
//         n1 = removeAtIndex(n1, 1);
//         printLinkedList(n1);
//         n1 = removeAtIndex(n1, 2);
//         printLinkedList(n1);
//         }
// }
public class SLList{

    private SLNode head;
    private String data;
    private String node;

    public void isEmpty(){
        return head = null;
    }

    private SLNode traversing(int pos){

        SLNode current = head;
        for (int i = 1; i < pos; i++) {
            current = current.getNext();
        }
        return current;
    }
    public void add(SLNode newNode){
        newNode.setNext(head);
        head = newNode;
    }

    public void removeAll(){
        head = null;
    }

    public void addAt(int pos, SLNode newbie){
        
    }
}
