package Homework;

public class StringArray {
    public static void main(String[] args) {
        String names[]={"Brita","Nirav","Sheetal","Brijal","Hardik"};
        names[3]="Deep";

        for (String name:names) {
            System.out.println(name);
            System.out.println(names.length);

        }
    }
}
