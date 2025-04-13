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
