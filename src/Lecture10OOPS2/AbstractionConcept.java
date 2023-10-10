package Lecture10OOPS2;

abstract class AbstractionConcept {
    // hide,show - methods, variables

    public abstract void myMethod1(); // no implementation only declaration

    public static void myMethod2(){
        System.out.println("Your Message is sending");
    }

    public static void main(String[] args) {
        myMethod2();

    }
}
