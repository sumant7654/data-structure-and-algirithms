public class BinaryTreeMainWithArray {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(9);
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
        binaryTree.insert("N8");
        binaryTree.insert("N9");


        System.out.print("\nPreOrder Traversal    :: ");
        binaryTree.preOrder(1);

        System.out.print("\nInOrder Traversal     :: ");
        binaryTree.inOrder(1);

        System.out.print("\nPostOrder Traversal   :: ");
        binaryTree.postOrder(1);

        System.out.print("\nLevelOrder Traversal  :: ");
        binaryTree.levelOrder();

        binaryTree.search("N6");
    }
}
