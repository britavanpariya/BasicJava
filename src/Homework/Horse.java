package Homework;

public class Horse {
//state
    static String colour = "Brown";
    static int height=6;
    static int legs=4;
    static String noise = "neigh";

    // behaviour
    public static void running(){
        System.out.println("I am a Horse and I neigh.");
    }

    public static void eating () {
        System.out.println("I eat chickpeas.");
    }

    public static void main(String[] args) {
        System.out.println(colour);
        System.out.println(height);
        System.out.println(legs);
        System.out.println(noise);
        running();
        eating();

    }

    }
