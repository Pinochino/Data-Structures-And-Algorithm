package Tutorial6;

class SLNode {
    private String data;
    private SLNode next;

    public SLNode(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(SLNode n) {
        this.next = n;
    }

    public SLNode getNext() {
        return this.next;
    }

    public String getData() {
        return this.data;
    }

    public void print() {
        System.out.println("Data: " + this.data);
    }
}

class SinglyLinkedList {
    private SLNode head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(SLNode n) {
        n.setNext(this.head);
        this.head = n;
        this.size++;
    }

    public void addAt(int pos, SLNode n) {
        if (pos < 0 || pos > this.size) {
            System.out.println("Invalid position.");
            return;
        }

        if (pos == 0) {
            add(n);
            return;
        }

        SLNode current = this.head;
        for (int i = 0; i < pos - 1; i++) {
            current = current.getNext();
        }

        n.setNext(current.getNext());
        current.setNext(n);
        this.size++;
    }

    public void remove(int pos) {
        if (pos < 0 || pos >= this.size) {
            System.out.println("Invalid position.");
            return;
        }

        if (pos == 0) {
            this.head = this.head.getNext();
            this.size--;
            return;
        }

        SLNode current = this.head;
        for (int i = 0; i < pos - 1; i++) {
            current = current.getNext();
        }

        current.setNext(current.getNext().getNext());
        this.size--;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void print() {
        SLNode current = this.head;
        while (current != null) {
            current.print();
            current = current.getNext();
        }
    }

    public int search(String data) {
        SLNode current = this.head;
        int pos = 0;
        while (current != null) {
            if (current.getData().equals(data)) {
                return pos;
            }
            current = current.getNext();
            pos++;
        }
        return -1;
    }
}

public class LinkedListADT {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(new SLNode("Node 1"));
        list.add(new SLNode("Node 2"));
        list.add(new SLNode("Node 3"));

        list.print(); 

        list.addAt(1, new SLNode("Node 4"));

        list.print(); 
        list.remove(2);

        list.print();

        System.out.println("Size: " + list.size()); 

        System.out.println("Is empty? " + list.isEmpty()); 
        System.out.println("Position of 'Node 4': " + list.search("Node 4")); 
    }
}
