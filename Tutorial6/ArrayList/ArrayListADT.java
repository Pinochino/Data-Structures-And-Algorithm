package Tutorial6.ArrayList;

public class ArrayListADT {
    private int[] array;
    private int size;
    private final int MAX_SIZE = 100;

    public ArrayListADT() {
        array = new int[MAX_SIZE];
        size = 0;
    }

    public void add(int data) {
        if (size < MAX_SIZE) {
            array[size] = data;
            size++;
        } else {
            System.out.println("List is full, cannot add more elements.");
        }
    }

    public void add(int pos, int data) {
        if (pos >= 0 && pos <= size && size < MAX_SIZE) {
            for (int i = size - 1; i >= pos; i--) {
                array[i + 1] = array[i];
            }
            array[pos] = data;
            size++;
        } else {
            System.out.println("Invalid position or list is full, cannot add element at position " + pos);
        }
    }

    public void remove(int pos) {
        if (pos >= 0 && pos < size) {
            for (int i = pos; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        } else {
            System.out.println("Invalid position, cannot remove element at position " + pos);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public int size() {
        return size;
    }

    public void printNode(int pos) {
        if (pos >= 0 && pos < size) {
            System.out.println("Data at position " + pos + ": " + array[pos]);
        } else {
            System.out.println("Invalid position.");
        }
    }

    public void printList() {
        System.out.print("List: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayListADT list = new ArrayListADT();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(1, 8);
        list.printList();
        list.remove(2);
        list.printList();
        System.out.println("Size of list: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
        System.out.println("Is list full? " + list.isFull());
        list.printNode(1);
    }
}
