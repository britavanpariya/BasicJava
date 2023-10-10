package Lecture10OOPS2;

public class InterfaceClassImplementation implements Interface1,Interface2 {

    @Override
    public void myMethod() {
        System.out.println("This is my Interface Implementation");
    }

    public static void main(String[] args) {
        InterfaceClassImplementation interfaceClassImplementation = new InterfaceClassImplementation();
        interfaceClassImplementation.myMethod();
    }
}
