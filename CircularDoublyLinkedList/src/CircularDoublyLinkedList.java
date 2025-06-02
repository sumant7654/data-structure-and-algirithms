public class CircularDoublyLinkedList {
    static DoublyNode head;
    static DoublyNode tail;
    static int size;


    public static void main(String[] args) {
        createCircularDoublyLinkedList(150);
        insertNodeIntoCircularDoublyLinkedList(50, 1);
        insertNodeIntoCircularDoublyLinkedList(100, 2);
        insertNodeIntoCircularDoublyLinkedList(200, 4);
        System.out.println(head.prev+"\t"+head.value+"\t"+head.next);
        System.out.println(head.next.prev+"\t"+head.next.value+"\t"+head.next.next);
        System.out.println(head.next.next.prev+"\t"+head.next.next.value+"\t"+head.next.next.next);
        System.out.println(tail.prev+"\t"+tail.value+"\t"+tail.next);


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
            tail.next = node;
            node.prev = tail;
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
