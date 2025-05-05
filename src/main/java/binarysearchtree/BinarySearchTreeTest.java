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
        kthSmallestElement();
        sumAges();
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

    public static void kthSmallestElement() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(14);
        bst.insert(16);
        bst.insert(-1);

        bst.remove(14);

        System.out.println(bst.getKSmallest(bst.getRoot(), 2));
    }

    public static void sumAges() {
        Tree<Person> bst = new BinarySearchTree<>();

        bst.insert(new Person("Adam", 47));
        bst.insert(new Person("Kevin", 21));
        bst.insert(new Person("Joe", 55));
        bst.insert(new Person("Arnold", 20));
        bst.insert(new Person("Noel", 34));
        bst.insert(new Person("Marko", 68));
        bst.insert(new Person("Susan", 23));
        bst.insert(new Person("Rose", 38));

        System.out.println(bst.getAgesSum());
    }
}
