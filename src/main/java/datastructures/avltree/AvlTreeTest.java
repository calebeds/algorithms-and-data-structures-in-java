package datastructures.avltree;

public class AvlTreeTest {
    public static void main(String[] args) {
        Tree<Integer> avl = new AvlTree<>();

        avl.insert(3);
        avl.insert(1);
        avl.insert(2);

        avl.traverse();
    }
}
