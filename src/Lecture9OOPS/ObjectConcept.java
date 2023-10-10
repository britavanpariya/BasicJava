package Lecture9OOPS;

public class ObjectConcept {
    //state
    int i =10;
    int j = 20;

    public static void main(String[] args) {
        //physical entity
        //in java it is called instance of class
        ObjectConcept oC = new ObjectConcept();
        System.out.println(oC.i);
        System.out.println(oC.j);
        oC.j=30;
        oC.barking();
        oC.sleeping();
    }
    public void barking(){
        System.out.println("Dog is barking");

    }
    public void sleeping(){
        System.out.println("Dog is sleeping");
    }
}
