public class DoublyLinkedList {
    static DoublyNode head;
    static DoublyNode tail;
    static int size;

    public static void main(String[] args) {

        DoublyNode node = createDoublyLinkedList(100);
        System.out.println(head.prev+" | "+head.value+" | "+head.next);

    }

    private static DoublyNode createDoublyLinkedList(int nodeValue) {
        if(head == null){
            DoublyNode node = new DoublyNode();
            node.value = nodeValue;
            node.prev =  node.next = null;
            head = tail = node;
            size = 1;
        }
        return head;
    }
}
