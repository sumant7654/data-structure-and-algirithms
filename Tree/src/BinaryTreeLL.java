public class BinaryTreeLL {
    BinaryNode root;
    public BinaryTreeLL(){
        this.root = null;
    }
    /**
    * PreOrder Traversal ->
    * First Visit Root Node then Left Sub tree and then right Sub Tree
    */
    void preOrder(BinaryNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
    * InOrder Traversal ->
    * First Visit the Left Node then Root Node of the Sub-Tree after that Right Node
    */
    void inOrder(BinaryNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }

}
