package Homework;

public class Constructor {
// pre-defined constructor is a constructor with a null value
    Constructor(){
        System.out.println("This is a constructor");
    }
    Constructor(int i){
        System.out.println("The value of " + i);
    }
    public static void main(String[] args) {
       MyName();
        Constructor constructor = new Constructor(10);
        constructor.MyName();

    }

    public static void MyName(){
            System.out.println("Brita");

        }
}
