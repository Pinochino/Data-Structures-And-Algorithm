package Tutorial6.LinkedList;
public class LinkedList {

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                } else {
                    System.out.println();
                }
            }
        }
    }

    // Add element in the first of list

    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    // Add element in the last of list
    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);

        if (headNode == null) {
            return newNode;
        } else {
            // B1 Xác định last node (lastNode.next = NULL)
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            // B2 Gán nex cho lastNode = new Node
            lastNode.next = newNode;

        }
        return headNode;
    }

    // Add element in the middle of List
    public static Node addToIndex(Node headNode, int value, int index) {

        if (index == 0) {
            return addToHead(headNode, value);
        } else {
            // B1 Tìm vị trí mà nó được thêm vào
            Node newNode = new Node(value);
            Node curNode = headNode;
            int count = 0;
            while (curNode != null) {
                count++;
                if (count == index) {
                    // B2 Thực hiện thêm vào vị trí đó
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }

        }
        return headNode;
    }

    // Xoá phần tử đầu List
    public static Node removeAtHeadNode(Node headNode) {
        if (headNode != null) {
            return headNode.next;
        }
        return headNode;
    }

    // Xóa phần tử cuối List

    public static Node removeAtTail(Node headNode){
        if (headNode == null) {
            return headNode;
        }
        // B1 Xác định last và previous
        Node lastNode = headNode;
        Node prevNode = null;

        while (lastNode.next != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }
            if (prevNode == null) {
                return null;
            } else {
                prevNode.next = lastNode.next;
            }
        return headNode;
    }
    // Xóa phần tử ở giữa 

    public static Node removeAtIndex(Node headNode, int index){
        if (headNode == null || index < 0) {
            return null;
        }
        if (index == 0) {
            return removeAtHeadNode(headNode);
        }
        Node curNode = headNode;
        Node prevNode = null;
        int count = 0;
        boolean  isFound = true;
        while (curNode != null) {
            if (count == index) {
                // remove currentIndex
                break;
            }
            count++;
            prevNode = curNode;
            curNode = curNode.next;
        }
        if (isFound) {
            if (prevNode == null) { 
                // Current Node is Last node
                return null;
            } else {
                if (curNode != null) {
                    // Do nothing 
                    prevNode.next = curNode.next;
                }
            }
        }
        return headNode;
    }

}