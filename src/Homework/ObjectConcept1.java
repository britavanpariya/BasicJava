package Homework;

import static Homework.ObjectConcept2.d;

public class ObjectConcept1 {
    static int a =20;
    int b =30;

    public static void main(String[] args) {
        ObjectConcept1 oc = new ObjectConcept1();
        System.out.println(oc.a);
        System.out.println(oc.b);
        oc.b = 40;
        oc.raining();
        oc.dancing();
        System.out.println(d);
    }
        public void raining(){
            System.out.println("It is raining");
        }
        public void dancing(){
            System.out.println("Peacock is dancing");
        }
    }
