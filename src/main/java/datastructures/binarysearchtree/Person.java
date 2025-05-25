package datastructures.binarysearchtree;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private final int age;
    private final String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Person o) {
        return Comparator
                .comparing(Person::getAge)
                .compare(this, o);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
