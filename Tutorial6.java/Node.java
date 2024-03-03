public class Node extends ArrayList{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
        public static void main(String[] args) {
            Node n1 = new Node(1);
            Node n2 = new Node(2);
            Node n3 = new Node(3);
    
            n1.next = n2;
            n2.next = n3;
    
            printLinkedList(n1);
            // printLinkedList(n2);
            // printLinkedList(n3);
        n1 = removeAtTail(n1);
            printLinkedList(n1);
        }

}
