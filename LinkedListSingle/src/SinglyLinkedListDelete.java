public class SinglyLinkedListDelete {
    private Node head;
    private Node tail;
    private int size;

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedListDelete singlyLinkedListDelete = new SinglyLinkedListDelete();
        singlyLinkedListDelete.creteSinglyLinkedList(values);
        int location = 0;
        singlyLinkedListDelete.removeElementFromSinglyLinkedList(values, location);
    }

    private void removeElementFromSinglyLinkedList(int[] values, int location) {
        if (head == null) {
            System.out.println("Singly LinkedList not exist");
        } else {
            if (location == 0) {
                if (head == tail) {
                    head = tail = null;
                }else{
                    head = head.getNext();
                }
            } else if (location==size) {
                int temp = 0;
                Node previousNode = head;
                while (temp < size) {
                    previousNode = previousNode.getNext();

                    temp++;
                }
            }
        }
        System.out.println(head);
    }

    private void creteSinglyLinkedList(int[] values) {
        for (int i = 0; i < values.length; i++) {
            Node node = new Node();
            node.setValue(values[i]);
            if (head == null) {
                node.setNext(null);
                head = tail = node;
            } else {
                node.setNext(null);
                tail.setNext(node);
                tail = node;
            }
            size=i;
        }
        System.out.println(head);
    }


}
