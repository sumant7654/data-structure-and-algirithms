public class CreateCircularSinglyLinkedList {
    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {
        createCircularSinglyLinkedList(100);

        Node cur = head;
        while (cur.getNext() != null) {
            System.out.println(cur.getValue());
            cur = cur.getNext();
        }

    }

    private static void createCircularSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.setValue(nodeValue);
        node.setNext(null);
        if (head == null) {
            head = tail = node;
        }
        node.setNext(node);
        size = 1;
    }
}
