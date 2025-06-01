public class DoublyLinkedList {
    static DoublyNode head;
    static DoublyNode tail;
    static int size;

    public static void main(String[] args) {

        DoublyNode node = createDoublyLinkedList(100);

        insertNodeIntoDoubleLinkedList(25, 5);
        insertNodeIntoDoubleLinkedList(50, 2);
        traverseDoubleLinkedList(head);


    }

    private static void traverseDoubleLinkedList(DoublyNode head) {
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
