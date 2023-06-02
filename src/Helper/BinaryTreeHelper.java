package Helper;

public class BinaryTreeHelper {
    private final int value;
    private BinaryTreeHelper leftChild;
    private BinaryTreeHelper rightChild;
    private BinaryTreeHelper(int value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }
    private BinaryTreeHelper insertNode(int value, BinaryTreeHelper parent)  {
        if (parent==null) {
            parent = new BinaryTreeHelper(value);
            return (parent);
        } else
            if (parent.value > value)
                if (parent.leftChild==null) return (parent.leftChild = new BinaryTreeHelper(value));
                else return insertNode(value, parent.leftChild);
            else if (parent.value < value)
                if (parent.rightChild==null) return (parent.rightChild = new BinaryTreeHelper(value));
                else return insertNode(value, parent.rightChild);
        return null;
    }
    private void printTree(BinaryTreeHelper node, int level) {
        if (node != null) {
            printTree(node.leftChild, level+1);
            for (int i=0; i<level; i++) System.out.print("  ");
            System.out.println(node.value);
            printTree(node.rightChild, level+1);
        }
    }

    public static void main(String[] args) {
        int [] array = {1,6,7,3,5,74,35,6,2};
        BinaryTreeHelper tree = new BinaryTreeHelper(array[0]);
        for (int j : array) tree.insertNode(j, tree);
        tree.printTree(tree, 0);
    }
}
