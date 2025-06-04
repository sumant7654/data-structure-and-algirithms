
public class CircularDoublyLinkedList {
    static DoublyNode head;
    static DoublyNode tail;
    static int size;


    public static void main(String[] args) {
        createCircularDoublyLinkedList(150);
        insertNodeIntoCircularDoublyLinkedList(50, 1);
        insertNodeIntoCircularDoublyLinkedList(100, 2);
        insertNodeIntoCircularDoublyLinkedList(200, 4);
        traversalCircularDoublyLinkedList(head);
        reverseTraversalCircularDoublyLinkedList(tail);
        searchNodeInCircularDoublyLinkedList(250);
        deleteNodeFromCircularDoublyLinkedList(4);
        traversalCircularDoublyLinkedList(head);
        deleteEntireDoublyLinkedList();
        traversalCircularDoublyLinkedList(head);

    }

    private static void deleteEntireDoublyLinkedList() {
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        DoublyNode current = head;
        head = null;
        while(current != null){
            DoublyNode temp = current;
            current = current.next;
            temp.next = null;
            temp.prev = null;
        }
        tail = null;
        size = 0;
    }

    private static void deleteNodeFromCircularDoublyLinkedList(int position) {
        System.out.println("Deleting node at position " + position);
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        if(position == 1) {
            head = head.next;
            head.prev = tail;
            tail.next = head;

        }else if(position >= size) {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;

        }else{
            int counter = 1;
            DoublyNode current = head;
            while(counter < position - 1) {
                current = current.next;
                counter++;
            }
            current.next = current.next.next;
            current.next.prev = current;
        }
        size--;
    }

    private static void searchNodeInCircularDoublyLinkedList(int nodeValue) {
        System.out.println("Searching node " + nodeValue + " in circular doubly list.");
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        int counter = 1;
        DoublyNode current = head;
        while(counter <= size) {
            if(current.value == nodeValue) {
                System.out.println("Node Value = "+nodeValue +" is found at position "+counter);
                return;
            }
            current = current.next;
            counter++;
        }
        System.out.println("Node Value = "+nodeValue +" is not found!");

    }

    private static void reverseTraversalCircularDoublyLinkedList(DoublyNode tail) {
        System.out.println("Reversed doubly linked list");
        if (tail == null) {
            System.out.println("The list is empty");
            return;
        }
        int counter = size;
        DoublyNode current = tail;
        while (counter > 0) {
            System.out.print(current.next+"\t"+current.value+"\t"+current.prev);
            if(current != head) {
                System.out.print(" -> ");
            }
            current = current.prev;
            counter--;
        }
        System.out.println();


    }

    private static void traversalCircularDoublyLinkedList(DoublyNode head) {
        System.out.println("Traversal of Circular Doubly Linked List");
        if(head == null){
            System.out.println("No Elements in the List");
            return;
        }
        int counter = 1;
        DoublyNode current = head;
        while (counter <= size) {
            System.out.print(current.prev+"\t"+current.value+"\t"+current.next);
            if(current != tail){
                System.out.print(" -> ");
            }
            current = current.next;
            counter++;
        }
        System.out.println();
    }

    private static void insertNodeIntoCircularDoublyLinkedList(int nodeValue, int position) {
        if (head == null) {
            createCircularDoublyLinkedList(nodeValue);
            return;
        }
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        if(position == 1) {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            head = node;

        } else if (position > size) {
            node.next = head;
            node.prev = tail;
            tail.next = node;
            head.prev = node;
            tail = node;

        }else{
            int currentPosition = 1;
            DoublyNode currentNode = head;
            while (currentPosition < position - 1) {
                currentNode = currentNode.next;
                currentPosition++;
            }
            node.next = currentNode.next;
            node.prev = currentNode;
            currentNode.next.prev = node;
            currentNode.next = node;
        }
        size++;
    }

    private static void createCircularDoublyLinkedList(int nodeValue) {
        if(head == null) {
            DoublyNode node = new DoublyNode();
            node.value = nodeValue;
            node.next = node;
            node.prev = node;
            head = tail = node;
            size = 1;
        }
    }
}
