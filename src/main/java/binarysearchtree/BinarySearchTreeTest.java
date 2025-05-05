package binarysearchtree;

import static binarysearchtree.TreeCompareHandler.isTreeSame;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(14);
        bst.insert(16);
        bst.insert(-1);

        bst.remove(14);
        bst.traversal();

        System.out.println();

        compareTwoTrees();
    }

    public static void compareTwoTrees() {
        Tree<Integer> bst1 = new BinarySearchTree<>();

        bst1.insert(10);
        bst1.insert(5);
        bst1.insert(20);
        bst1.insert(1);

        Tree<Integer> bst2 = new BinarySearchTree<>();

        bst2.insert(10);
        bst2.insert(5);
        bst2.insert(20);
        bst2.insert(1);

        System.out.println(isTreeSame(bst1.getRoot(), bst2.getRoot()));
    }
}
