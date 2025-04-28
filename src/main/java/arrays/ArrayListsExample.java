package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsExample {
    public static void main(String[] args) {
        // ArrayLists use standard arrays under the hood
        // capacity = 10
        List<String> names = new ArrayList<>();

        names.add("Kevin");
        names.add("Daniel");
        names.add("Adam");
        names.add("Ana");

        System.out.println(names.get(0));

        // O(N)
        System.out.println(names.remove(0));
        System.out.println(names.get(0));

        for(String name: names) {
            System.out.println(name);
        }

    }
}
