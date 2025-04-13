public class SinglyLinkedListDelete {
    private Node head;
    private Node tail;
    private int size;

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedListDelete singlyLinkedListDelete = new SinglyLinkedListDelete();
        singlyLinkedListDelete.creteSinglyLinkedList(values);
        int location = 0;
        singlyLinkedListDelete.removeElementFromSinglyLinkedList(location);

        singlyLinkedListDelete.traverseLinkedList();



    }

    private  void traverseLinkedList() {
        System.out.println();
        Node currentNode = head;
        for(int i = 0; i <= size; i++){
            System.out.print(currentNode.getValue());
            if(i != size){
                System.out.print(" | -> ");
            }
            currentNode = currentNode.getNext();

        }

    }

    private void removeElementFromSinglyLinkedList(int location) {
        if(head != null){
            if(location == 0){
                head = head.getNext();
                size--;
                if(size == 0){
                    tail = head;
                }
            } else if(location <= size) {
                int currentLocation = 1;
                Node previousNode = head;
                while(currentLocation != location){
                    previousNode = previousNode.getNext();
                    currentLocation++;
                }
                previousNode.setNext(previousNode.getNext().getNext());
                if(size == location) {
                    tail = previousNode;
                }
                size--;
            }
        }


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
