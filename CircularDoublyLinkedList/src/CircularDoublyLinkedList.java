public class CircularDoublyLinkedList {
    static DoublyNode head;
    static DoublyNode tail;
    static int size;


    public static void main(String[] args) {
        createCircularDoublyLinkedList(100);
        System.out.println(head.prev+"\t"+head.value+"\t"+head.next);

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
