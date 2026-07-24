public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size){
        arr = new String[size+1];
        this.lastUsedIndex = 0;
        System.out.println("Blank Tree of Size "+size+" has been created.");
    }
    // isFull
    boolean isFull(){
        return arr.length -1 == lastUsedIndex;
    }

    // insert new Element
    void insert(String value){
        if(!isFull()){
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("The value of "+value+" has been inserted");
        } else{
          System.err.println("The BT is full");
        }
    }


    /**
     * * PreOrder Traversal ->
     * * First Visit Root Node then Left Sub tree and then right Sub Tree
     *
     */
    void preOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        System.out.print(arr[index]+" ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }
}
