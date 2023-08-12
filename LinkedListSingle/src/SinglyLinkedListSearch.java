public class SinglyLinkedListSearch {
    private Node head;
    private Node tail;
    private int size;
    public static void main(String[] args) {
        SinglyLinkedListSearch singlyLinkedListSearch = new SinglyLinkedListSearch();
        singlyLinkedListSearch.createSinglyLinkedList(new int[]{20,50,15,30,13});
        System.out.println(singlyLinkedListSearch.head);
        singlyLinkedListSearch.searchInSinglyLinkedList(13);
    }

    private void createSinglyLinkedList(int[] nodeValues) {
        for(int i = 0; i< nodeValues.length; i++){
            Node node = new Node();
            node.setValue(nodeValues[i]);
            node.setNext(null);
            if(head == null){
                head = tail = node;
            }else{
                tail.setNext(node);
                tail = node;
            }
            size++;
        }
    }

    private void searchInSinglyLinkedList(int value){
        if(head == null){
            System.out.println("Singly LinkedList is null");
        }else{
            Node tempNode = head;
            for(int i = 0; i < size; i++){
                if(tempNode.getValue() == value){
                    System.out.println("Value found at position "+i);
                    return;
                }else {
                    tempNode = tempNode.getNext();
                }
            }
            System.out.println("Value not found.");
        }
    }
}
