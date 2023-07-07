package Tree;

public class BinaryTree extends Tree {
    private static Tree root;
    public BinaryTree(int value) {
        super(value);
    }

    public Tree insert(int value, Tree parent)  {
        if (parent==null) {
            root = new BinaryTree(value);
            return root;
        }
        else if (parent.value > value)
                if (parent.leftChild==null) return (parent.leftChild = new BinaryTree(value));
                else return insert(value, parent.leftChild);
            else
                if (parent.value < value)
                    if (parent.rightChild==null) return (parent.rightChild = new BinaryTree(value));
                    else return insert(value, parent.rightChild);
                else return parent;
    }

    @Override
    public Tree find(int value, Tree tree) {
        if (tree == null) return null;
        else if (value == tree.value) return tree;
            else if (value > tree.value) return find(value, tree.rightChild);
                else return find(value, tree.leftChild);
    }
    @Override
    public void print(Tree tree, int level) {
        if (tree != null) {
            print(tree.leftChild, level+1);
            for (int i=0; i<level; i++) System.out.print("  ");
            System.out.println(tree.value);
            print(tree.rightChild, level+1);
        }
    }
    @Override
    public boolean remove(int value, Tree tree) {
        if (tree==null) return false;
        else if (tree.value>value) return remove(value, tree.leftChild);
        else if (tree.value<value) return remove(value, tree.rightChild);
        else {
            if (tree.leftChild==null && tree.rightChild==null) changeParentsChild(null, tree);
            else if (tree.leftChild==null) changeParentsChild(tree.rightChild, tree);
            else if (tree.rightChild==null) changeParentsChild(tree.leftChild, tree);
            else
                if (tree.rightChild.leftChild==null) changeParentsChild(tree.rightChild, tree);
                else {
                    Tree treeRL = tree.rightChild.leftChild;
                    while (treeRL.leftChild!=null) treeRL = treeRL.leftChild;
                    int treeRLValue = treeRL.value;
                    remove(treeRL.value, tree);
                    tree.value = treeRLValue;
                }
            return true;
        }
    }
    private static Tree searchParent(int value) { //возвращает ноль при ошибке
        Tree tree = root;
        while (tree!=null) {
            if (tree.value<value)
                if (tree.rightChild==null) tree = null;
                else if (tree.rightChild.value!=value) tree = tree.rightChild;
                else break;
            else
            if (tree.leftChild==null) tree = null;
            else if (tree.leftChild.value!=value) tree = tree.leftChild;
            else break;
        }
        return tree;
    }
    private void changeParentsChild(Tree childTree, Tree tree) {
        if (searchParent(tree.value).value<tree.value) searchParent(tree.value).rightChild=childTree;
        else searchParent(tree.value).leftChild=childTree;
    }

    public static void main(String[] args) {
        int [] array = {0, 3, 6, 2, 8, 1,  4, -1, 7};
        root = new BinaryTree(array[0]);
        for (int j=1; j < array.length; j++) root.insert(array[j], root);
        root.print(root, 0);
        System.out.println(root.value);
        System.out.println(root.find(7, root).value);
        System.out.println(searchParent(7));
        root.remove(0, root);
        root.print(root, 0);
    }
}
