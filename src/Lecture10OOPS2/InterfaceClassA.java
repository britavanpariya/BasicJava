package Lecture10OOPS2;

public class InterfaceClassA implements InterfaceA{
    @Override
    public void myMethod1() {
        System.out.println("This is my implementation");
    }

    @Override
    public void myMethod2() {
    }

    @Override
    public void deposit() {
    }

    @Override
    public void withdraw(int a) {
    }

    @Override
    public void balanceCheck() {
    }
}
