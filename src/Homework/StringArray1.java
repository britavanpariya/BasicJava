package Homework;

public class StringArray1 {
    public static void main(String[] args) {
        String names[]={"Brita","Nirav","Sheetal","Brijal","Hardik"};
        names[3]="Deep";
        System.out.println(names[3]);
        System.out.println(names.length);
        for (int i=0; i<=names.length-1;i++){
            System.out.println(i);
        }
    }
}
