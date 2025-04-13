public class DeleteEntireSinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public static void main(String[] args) {
        DeleteEntireSinglyLinkedList linkedListObject = new DeleteEntireSinglyLinkedList();
        linkedListObject.createSinglyLinkedList(new int[]{10,50,30,20,10});
        linkedListObject.traverseSinglyLinkedList();
        linkedListObject.deleteEntireSinglyList();
        System.out.println();
        linkedListObject.traverseSinglyLinkedList();


    }

    private void deleteEntireSinglyList() {
        head = tail = null;
    }

    public void createSinglyLinkedList(int[] nodeValues){

        for(int i = 0; i < nodeValues.length; i++){
            Node node = new Node();
            node.setValue(nodeValues[i]);
            if(head == null){
                node.setNext(null);
                head = tail = node;
            }else{
                node.setNext(null);
                tail.setNext(node);
                tail = node;
            }
            size++;
        }
    }

    public void traverseSinglyLinkedList(){
        if(head == null){
            System.out.println("Singly LinkedList is not exist");
        }else{
            Node tempNode = head;
            for(int i = 0; i < size; i++){
                System.out.print(tempNode.getValue());
                tempNode = tempNode.getNext();
                if(i != size - 1){
                    System.out.print(" -> ");
                }
            }
        }
    }
}
