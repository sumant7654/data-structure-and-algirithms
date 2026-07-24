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

    /**
     * InOrder Traversal ->
     * First Visit the Left Node then Root Node of the Sub-Tree after that Right Node
     */

    void inOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        inOrder(index * 2);
        System.out.print(arr[index]+" ");
        inOrder(index * 2 + 1);

    }
    /**
     * PostOrder Traversal ->
     * First Visit the Left SubTree then Right Subtree after that Root Node
     */
    void postOrder(int index) {
        if(index > lastUsedIndex){
            return;
        }
        postOrder(index * 2);
        postOrder(index * 2 + 1);
        System.out.print(arr[index]+" ");
    }

    /**
     * LevelOrder Traversal ->
     * First Visit Root Level then Level 1 (Left to Right) then next level so on
     */
    void levelOrder(){
        int index = 1;
        while(index <= lastUsedIndex){
            System.out.print(arr[index]+ " ");
            index++;
        }


    }

    void search(String value) {
        for(int i = 1; i <= lastUsedIndex; i++){
            if(value.equals(arr[i])){
                System.out.println("\nThe value found at index:"+i);
                return;
            }
        }
        System.err.println("\nThe value not found in the tree");
    }

    void delete(String value){
        for(int i = 1; i <= lastUsedIndex; i++){
            if(arr[i].equals(value)){
                arr[i] = arr[lastUsedIndex];
                arr[lastUsedIndex] = null;
                lastUsedIndex--;
                System.out.println("\nThe value deleted from tree");
                return;
            }
        }
        System.err.println("\nThe value not found in the tree");
    }

    public void deleteAllNodes() {
        arr = null;
        System.out.println("\nThe Binary Tree has been successfully deleted");
    }
}
