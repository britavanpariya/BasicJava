package Lecture10OOPS2;

public class AbstractionImplementation extends AbstractionConcept {
    public void myMethod1(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        System.out.println("This is the implementation of that Hidden Method");
    }

    @Override
    public void myMethod1() {

    }

    public static void main(String[] args) {
        AbstractionImplementation abstractionImplementation = new AbstractionImplementation();
        abstractionImplementation.myMethod1(10,20);
    }
}
