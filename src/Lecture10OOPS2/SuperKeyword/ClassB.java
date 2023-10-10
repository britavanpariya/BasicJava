package Lecture10OOPS2.SuperKeyword;

public class ClassB extends ClassA{
    public void myMethod(){
        super.myMethod();
        System.out.println("This is my method B");
    }

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.myMethod();

    }
}
