import java.util.LinkedList;
import java.util.Queue;

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

    /**
     * PostOrder Traversal ->
     * First Visit the Left SubTree then Right Subtree after that Root Node
     */

    void postOrder(BinaryNode node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }

    /**
     * LevelOrder Traversal ->
     * First Visit Root Level then Level 1 (Left to Right) then next level so on
     */
    void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode currentNode = queue.remove();
            System.out.print(currentNode.value+" ");
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }

    }
    /**
    * Binary Tree Search ->
    * For search use LevelOrder because Queue is better than Stack
    */
    void search(String value){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode currentNode = queue.remove();
            if(currentNode.value.equals(value)){
                System.out.println("\nThe value "+value+" found in tree");
                return;
            }else{
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
        }
        System.err.println("\nThe value "+value+" not found");
    }

    /**
     * Binary Tree Insert
     */

    void insert(String value){
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;

        if(root == null){
            root = newNode;
            System.out.print("Inserted new node at Root    :: ");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode currentNode = queue.remove();
            if(currentNode.left == null){
                currentNode.left = newNode;
                System.out.print("Inserted new node    :: ");
                break;
            }else if(currentNode.right == null){
                currentNode.right = newNode;
                System.out.print("Inserted new node    :: ");
                break;
            }else{
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
        }
    }

    /**
     * Binary Tree Delete ->
     * Use Level Order Traversal
     * Step 1 - Find the Node
     * Step 2 - Find Deepest Node
     * Step 3 - Set Deepest Node's value to Current Node
     * Step 4 - Delete Deepest Node
     */
    void deleteNode(String value){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode currentNode = queue.remove();
            if(currentNode.value.equals(value)){
                currentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("The node is deleted");
                return;
            } else {
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }

        }
        System.out.println("The node does not exist in Binary Tree");

    }
    /**
    * Get Deepest Node
    */

    BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode currentNode = null;
        while(!queue.isEmpty()){
            currentNode = queue.remove();
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }

        }
        return currentNode;
    }

    void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode previousNode=null, currentNode = null;
        while(!queue.isEmpty()){
            currentNode = queue.remove();

            if(currentNode.left != null){
                previousNode = currentNode;
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                previousNode = currentNode;
                queue.add(currentNode.right);
            }
        }

        if(previousNode != null){
            if (previousNode.right == currentNode){
                previousNode .right = null;
            }else{
                previousNode.left = null;
            }
        }else{
            root = null;
        }
    }


}
