package Tree;

public abstract class Tree {
    public int value;
    public Tree leftChild;
    public Tree rightChild;
    public Tree(int value) {
        this.value = value;
        leftChild = null;
        rightChild = null;
    }
    public abstract Tree insert(int value, Tree parent);
    public abstract Tree find(int value, Tree tree);
    public abstract void print(Tree node, int level);
    public abstract boolean remove(int value, Tree tree);
}
