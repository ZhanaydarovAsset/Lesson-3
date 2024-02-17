package org.example;
import java.util.List;

public class ListComparator {

    public static <T> boolean compareArrays(List<T> list1, List<T> list2) {

        if (list1 == null || list2 == null) return false;

        if (list1.size() != list2.size()) return false;

        for (int i = 0; i < list1.size(); i++) {
            T item1 = list1.get(i);
            T item2 = list2.get(i);

            if (!item1.getClass().equals( item2.getClass())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Cat> cats1 = List.of(new Cat("Cat1"), new Cat("Cat2"));
        List<Cat> cats2 = List.of(new Cat("Cat1"), new Cat("Cat2"));
        List<Cat> cats3 = List.of(new Cat("Cat3"), new Cat("Cat4"));

        System.out.println("Comparing cats1 and cats2: " + compareArrays(cats1, cats2));
        System.out.println("Comparing cats1 and cats3: " + compareArrays(cats1, cats3));
    }
}

class Animal {}

class Cat extends Animal {
    String name;

    Cat(String name) {
        this.name = name;
    }

}

