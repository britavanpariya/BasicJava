package Lecture7ConditionalStatements;

public class ConditionalStatement1 {
    public static void main(String[] args) {
        //conditional statement
        // 1. if else

        int a=10;
        int b=20;
        int c=30;
        if(a==b || b==c){
            System.out.println("Numbers are same");
        }
        else if (a>b && a>c){
            System.out.println("a is greater");
        }else if (b>a && b>c){
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");

        }
    }
}
