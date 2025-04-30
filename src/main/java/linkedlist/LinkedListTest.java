package linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
//        LinkedList<String> names = new LinkedList<>();
//
//        names.insert("Adam");
//        names.insert("Daniel");
//        names.insert("Ana");
//
//        names.traverse();
//        names.remove("Daniel");
//        System.out.println();
//        names.traverse();

        LinkedList<Person> people = new LinkedList<>();

        people.insert(new Person(23, "Adam"));
        people.insert(new Person(34, "Daniel"));
        people.insert(new Person(56, "Michael"));
        people.insert(new Person(46, "Terry"));


        System.out.println(people.getMiddleNode());


    }
}
