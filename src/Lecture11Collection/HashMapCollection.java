package Lecture11Collection;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapCollection {
    public static void main(String[] args) {
        //HashMap - Key value pair
        //1. Nirav
        //2. Amit
        //3. Jahanvi
        //4. Brita
        HashMap<String,String> names = new HashMap<>();
        names.put("First","Nirav");
        names.put("Second","Amit");
        names.put("Third","Jahanvi");
        names.put("Fourth","Brita");

        System.out.println(names);
        System.out.println(names.get("Third"));


    }
}
