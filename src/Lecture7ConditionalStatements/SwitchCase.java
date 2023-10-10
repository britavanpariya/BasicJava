package Lecture7ConditionalStatements;

public class SwitchCase {
    public static void main(String[] args) {
        //1 = Monday
        //2 = Tuesday
        //3 = Wednesday
        //4 = Thursday
        //5 = Friday

        int a = 1;
        switch (a){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            default:
                System.out.println("Your condition does not match the condition");
        }
    }
}
