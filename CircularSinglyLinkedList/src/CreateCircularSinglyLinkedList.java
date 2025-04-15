public class CreateCircularSinglyLinkedList {
    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {
        createCircularSinglyLinkedList(100);
        insertIntoCircularSinglyLinkedList(2, 200);
        insertIntoCircularSinglyLinkedList(3, 300);
        insertIntoCircularSinglyLinkedList(2, 400);
        insertIntoCircularSinglyLinkedList(1, 500);




        traverseCircularSingleLinkedList();
        System.out.println();
        searchNodeValue(400);

        deleteNodeByPosition(4);
        traverseCircularSingleLinkedList();

        deleteEntireCircularLinkedList();
        traverseCircularSingleLinkedList();

    }

    private static void deleteEntireCircularLinkedList() {
        if(head != null) {
            head = null;
            tail.setNext(null);
            tail = null;
            size = 0;
            System.out.println("\nLinked List has been deleted");
        }
    }

    private static boolean deleteNodeByPosition(int position) {
        if(head == null || position < 1 || position > size) {
            return false;
        }

        if(position == 1) {
            if (size == 1) {
                head.setNext(null);
                head = null;
                tail = null;
                size--;
            } else {
                Node temp = head;
                head = head.getNext();
                tail.setNext(temp.getNext());
                temp = null;
                size--;
            }
        }else if(position == size){
                if(size == 1){
                    head.setNext(null);
                    head = null;
                    tail = null;
                    size--;
                }else{
                    Node temp = head;
                    int count = 1;
                    while(count < position - 1){
                        temp = temp.getNext();
                        count++;
                    }
                    temp.setNext(tail.getNext());
                    tail = temp;
                    size--;

                }
        }else{
            Node temp = head;
            int count = 1;
            while(count < position - 1){
                temp = temp.getNext();
                count++;
            }
            temp.setNext(temp.getNext().getNext());
            size--;
        }
        return true;

    }

    private static void searchNodeValue(int nodeValue) {
        if(head != null) {
            Node temp = head;
            int count = 1;
            while(count <= size) {
                if(temp.getValue() == nodeValue) {
                    System.out.println("Node value "+nodeValue+" found at "+count);
                    return;
                }
                temp = temp.getNext();
                count++;
            }

        }
        System.out.println("Node value "+nodeValue+" not found");
    }

    private static void traverseCircularSingleLinkedList() {
        Node cur = head;
        int count = 1;
        while (count <= size) {
            System.out.print(cur.getValue());
            cur = cur.getNext();
            if(count < size){
                System.out.print(" -> ");
            }
            count++;

        }
    }

    private static void insertIntoCircularSinglyLinkedList(int location, int nodeValue) {
        if (location < 1) {
            return;
        }
        if (head == null) {
            createCircularSinglyLinkedList(nodeValue);
            return;
        }
        Node insertNode = new Node();
        insertNode.setValue(nodeValue);
        if(location == 1) {
            insertNode.setNext(head);
            head = insertNode;
            tail.setNext(head);
            size++;
        }else if(location > size){
            insertNode.setNext(tail.getNext());
            tail.setNext(insertNode);
            tail = insertNode;
            size++;
        }else{
            int count = 1;
            Node previousNode = head;
            while(count < location - 1) {
                previousNode = previousNode.getNext();
                count++;
            }
            insertNode.setNext(previousNode.getNext());
            previousNode.setNext(insertNode);
            size++;
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
