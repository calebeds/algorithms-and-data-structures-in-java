package stacks.withlinkedlist;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Adam");
        names.push("Ana");
        names.push("Kevin");
        names.push("Michael");

        while (!names.isEmpty()) {
            System.out.println(names.pop());
        }
    }
}
