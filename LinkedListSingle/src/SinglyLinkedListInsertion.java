public class SinglyLinkedListInsertion {
    private Node head;
    private Node tail;
    private int size;

    public static void main(String[] args) {
        SinglyLinkedListInsertion singlyLinkedListInsertion = new SinglyLinkedListInsertion();
        singlyLinkedListInsertion.creteSinglyLinkedList(10);
        System.out.println(singlyLinkedListInsertion.head.getValue());
        singlyLinkedListInsertion.insertNodeInSinglyLinkedList(100,1);
        System.out.println(singlyLinkedListInsertion.head.getNext().getValue());
        singlyLinkedListInsertion.insertNodeInSinglyLinkedList(200,1);
        System.out.println(singlyLinkedListInsertion.head.getNext().getValue());
        System.out.println("Final LinkedLst="+singlyLinkedListInsertion.head);

    }

    /**
     * @param nodeValue
     * @return Node
     * @Author Sumanta Kumar
     * @apiNote Create Single LinkedList
     */
    public Node creteSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.setValue(nodeValue);
        node.setNext(null);
        head = tail = node;
        size = 1;
        return node;
    }

    /**
     * @param nodeValue
     * @param location
     * @Author Sumanta Kumar
     * @apiNote Insert New Node into Singly LinkedList
     */

    public void insertNodeInSinglyLinkedList(int nodeValue, int location) {

        if (head == null) {
            Node node = creteSinglyLinkedList(nodeValue);
        } else {
            Node node = new Node();
            node.setValue(nodeValue);
            if (location == 0) {
                node.setNext(head);
                System.out.println("Head="+head);
                System.out.println("Head.next="+head.getNext());
                head = node;
                System.out.println("Head="+head);
                System.out.println("Head.next="+head.getNext());
            } else if (location >= size) {
                System.out.println("Head="+head);
                node.setNext(null);
                System.out.println("Tail="+tail);
                tail.setNext(node);
                tail = node;
                System.out.println("Tail="+tail);
                System.out.println("Head="+head);
            } else {
                Node tempNode = head;
                int index = 0;
                while (index < location - 1) {
                    tempNode = tempNode.getNext();
                    index++;
                }
                Node nextNode = tempNode.getNext();
                tempNode.setNext(node);
                node.setNext(nextNode);
            }
            System.out.println("Head Here="+head);
            size += 1;
        }


    }
}
