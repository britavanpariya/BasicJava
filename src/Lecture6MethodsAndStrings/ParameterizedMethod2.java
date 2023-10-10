package Lecture6MethodsAndStrings;

public class ParameterizedMethod2 {
    public static void main(String[] args) {
        employeeId(101);
        employeeName("Brita Vanpariya");

    }
    public static void employeeId (int a) {
        System.out.println("This employeeId is " + a);
    }
    public static void employeeName (String name){
        System.out.println("This employee name is " + name);
    }

}
