package Lecture10OOPS2;

public class MethodOverloading {
    public static void main(String[] args) {

        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.addTwoNumbers();
        methodOverloading.addNumbers(10,20);
        methodOverloading.addNumbers(10,20,30);
        methodOverloading.addNumbers(40,50);
    }

    public void addTwoNumbers() {

        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }

    public void addNumbers(int a, int b){
        System.out.println(a+b);
    }

    public void addNumbers(int a, int b, int c){
        System.out.println(a+b+c);
    }

}
