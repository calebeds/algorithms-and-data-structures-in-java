package datastructures.doublylinkedlist;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList<String> names = new DoublyLinkedList<>();

        names.insert("Adam");
        names.insert("Kevin");
        names.insert("Ana");
        names.insert("Daniel");

        names.traverseForward();

        System.out.println();

        names.traverseBackward();
    }
}
