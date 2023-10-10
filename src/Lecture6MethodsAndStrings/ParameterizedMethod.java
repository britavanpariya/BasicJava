package Lecture6MethodsAndStrings;

public class ParameterizedMethod {
    public static void main(String[] args) {
     sumOfTwoNumbers( 20, 30);
     sumOfTwoNumbers(40, 50);
     subtractionOfTwoNumbers(30, 40);
     subtractionOfTwoNumbers(30,40);

        }

    public static void sumOfTwoNumbers( int a, int b) {
        System.out.println(a+b);

    }

    public static void subtractionOfTwoNumbers(int a, int b) {
        System.out.println(b-a);

    }
}
