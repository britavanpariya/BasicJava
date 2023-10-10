package Lecture11Collection;

public class ExceptionHandling {
    public static void main(String[] args) {
    ExceptionHandling exceptionHandling = new ExceptionHandling();
    exceptionHandling.arrayMethod();
    }

        public void arrayMethod() {
            String names[] = {"Brita", "Nirav", "Jahanvi", "Amit"};
            //                   0       1        2         3
            //exception handling use syntax as below

            try {//protected code
                System.out.println(names[4]);
            } catch (Exception e) {
                //catch block = first it catches and then blocks
                System.out.println(e);
            } finally {
                //Final block. this block always executes
                System.out.println("Our code has moved on");
            }
            System.out.println(names[2]);

            System.out.println(names[1]);
        }
    }
