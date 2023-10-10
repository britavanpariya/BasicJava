package Homework;

public class CharArray {
    public static void main(String[] args) {
        char a[] = {'d','e','f'};
        a[0] = 'e';
        System.out.println(a[0]);
        System.out.println(a.length);
        for (char i :a) {
            System.out.println(i);
        }
        for (int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }

    }
}
