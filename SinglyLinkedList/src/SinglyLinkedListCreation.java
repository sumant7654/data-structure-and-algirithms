public class SinglyLinkedListCreation {
    public Node head;
    public Node tail;
    public int size;

    /** @Author Sumanta Kumar
     * @apiNote Create Single LinkedList
     * @param nodeValue
     * @return Node
     */
    public Node createSinglyLinkedList(int nodeValue){
        Node node = new Node();
        node.setValue(nodeValue);
        node.setNext(null);

        head = tail = node;
        size = 1;
        return head;

    }

    public static void main(String[] args) {
        SinglyLinkedListCreation singlyLinkedListCreation = new SinglyLinkedListCreation();
        Node node = singlyLinkedListCreation.createSinglyLinkedList(5);
        System.out.println(singlyLinkedListCreation.head.getValue());
    }
}
