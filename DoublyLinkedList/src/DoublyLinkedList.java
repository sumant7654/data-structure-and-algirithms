public class DoublyLinkedList {
    static DoublyNode head;
    static DoublyNode tail;
    static int size;

    public static void main(String[] args) {

        createDoublyLinkedList(100);

        insertNodeIntoDoubleLinkedList(25, 5);
        insertNodeIntoDoubleLinkedList(50, 2);
        System.out.println("Traversal of DoublyLinkedList: ");
        traversalDoublyLinkedList(head);
        System.out.println("Reverse Traversal of DoublyLinkedList: ");
        reverseTraversalDoublyLinkedList(tail);
        System.out.println("Searching of Node Value in DoublyLinkedList: ");
        searchNodeValueInDoublyLinkedList(head, 50);
        deleteNodeFromDoublyLinkedList(2);
        System.out.println("Traversal of DoublyLinkedList After deleting A Node: ");
        traversalDoublyLinkedList(head);



    }

    private static void deleteNodeFromDoublyLinkedList(int position) {
        if(head == null) {
            return;
        }
        if(position == 1) {
            head = head.next;
            head.prev = null;
            size--;
        }else if(position == size) {
            tail = tail.prev;
            tail.next = null;
            size--;
        }else{
            int currentPosition = 1;
            DoublyNode currentNode = head;
            while(currentPosition < position - 1){
                currentNode = currentNode.next;
                currentPosition++;
            }
            currentNode.next = currentNode.next.next;
            currentNode.next.prev = currentNode;
            size--;
        }
    }

    private static void searchNodeValueInDoublyLinkedList(DoublyNode head, int nodeValue) {
        if (head == null) {
            return;
        }
        DoublyNode current = head;
        int currentPosition = 1;
        while (current != null) {
            if(current.value == nodeValue){
                System.out.println(current.value+" found at position "+currentPosition);
                break;
            }
            currentPosition++;
            current = current.next;
        }
        if(current == null){
            System.out.println("Node not found");
        }
    }

    private static void reverseTraversalDoublyLinkedList(DoublyNode tail) {
        if(tail == null) {
            return;
        }
        DoublyNode current = tail;
        while(current != null) {

            System.out.print(current.next+" | "+current.value+" | "+current.prev);
            if(current.prev != null) {
                System.out.print(" <-> ");
            }
            current = current.prev;
        }
    }

    private static void traversalDoublyLinkedList(DoublyNode head) {
        if (head == null) {
            return;
        }
        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.prev+" | "+current.value+" | "+current.next);
            if(current.next != null) {
                System.out.print(" <-> ");
            }
            current = current.next;
        }
    }

    private static void insertNodeIntoDoubleLinkedList(int nodeValue, int position) {
        if(head == null) {
            createDoublyLinkedList(nodeValue);
        }else {
            if(position == 1) {
                DoublyNode newNode = new DoublyNode();
                newNode.value = nodeValue;
                newNode.prev = null;
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
                size++;
            } else if (position > size) {
                DoublyNode newNode = new DoublyNode();
                newNode.value = nodeValue;
                newNode.prev = tail;
                newNode.next = null;
                tail.next = newNode;
                tail = newNode;
                size++;
            }else{
                int currentPosition = 1;
                DoublyNode tempNode = head;
                while(currentPosition < position-1) {
                    tempNode = tempNode.next;
                    currentPosition++;
                }
                DoublyNode newNode = new DoublyNode();
                newNode.value = nodeValue;
                newNode.prev = tempNode;
                newNode.next = tempNode.next;
                tempNode.next.prev = newNode;
                tempNode.next = newNode;
                size++;
            }
        }

    }

    private static void createDoublyLinkedList(int nodeValue) {
        if(head == null){
            DoublyNode node = new DoublyNode();
            node.value = nodeValue;
            node.prev =  node.next = null;
            head = tail = node;
            size = 1;
        }
    }
}
