package Lecture11Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTopic {
    public static void main(String[] args) {
        //Array - Collection of variables
        String names[]={"Brita","Nirav","Jahanvi"}; //fixed
        System.out.println(names[4]);//exception


        for (String name: names){
            System.out.println(name);
        }
        //ArrayList = dynamic in size.
        ArrayList<String> nextProduct = new ArrayList<>(); //[Shirt, T-Shirts, night wear]
                                                          //   0       1       2
        LinkedList<String> studentNames = new LinkedList<>();
        //Linkedlist = it is quick and fast. It is similar to array list but its fast and quick.
        studentNames.add("Brita");
        studentNames.add("Jahanvi");
        System.out.println(studentNames);



        nextProduct.add("Shirts");
        nextProduct.add("T-Shirts");
        nextProduct.add("Pants");
        //..
        //..
        //..
        nextProduct.add("night wear");
        nextProduct.remove("Pants");
        nextProduct.remove(2);
// you can add and remove the values or products by using nextProduct. you do not need to go manually to the array and change the value.
        System.out.println(nextProduct);
        nextProduct.add(1,"Kids Shirts");
        System.out.println(nextProduct.contains("Shoes"));
        nextProduct.set(0,"Pants");
        System.out.println(nextProduct);

    }

}
