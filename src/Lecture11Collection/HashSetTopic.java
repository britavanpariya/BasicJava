package Lecture11Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTopic {
    public static void main(String[] args) {
        //Array List - slower
        //Linked list - faster
        //HashSet - 1.We cannot add duplicate values.
        //Linked HasSet - sames as HashSet but it is Faster
        HashSet<String> studentNames= new HashSet<>();
        studentNames.add("Brita");
        studentNames.add("Jahanvi");
        studentNames.add("Nirav");
        studentNames.add("Brita");

        studentNames.remove("Nirav");
        studentNames.add("Nirav Goyani");

        System.out.println(studentNames);

        LinkedHashSet<String> nextProducts = new LinkedHashSet<>();
        nextProducts.add("Shirts");
        nextProducts.add("T-shirts");
        nextProducts.add("Shoes");
        nextProducts.add("Shirts");

        System.out.println(nextProducts);

    }
}
