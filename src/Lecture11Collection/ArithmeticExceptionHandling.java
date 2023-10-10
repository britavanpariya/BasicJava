package Lecture11Collection;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        int a = 10/0;
        int b; // this is called null pointer exception. the value is not assigned.
        int c = a/b;
        System.out.println(c);
        // checked exception - compile time, file read code - path (src/lecture5)
        // if you want to check wether the given path has the file or not then you can use file read code.
        // if the file is not there then you will get an error "File not found exception"
        //eg of checked exception - IOexception, SQLException, FileNotFoundException etc.
        // Checked exceptions are checked at compile time.


        //Unchecked exception -  these are known as a run time exception.
        // they are checked when we run the code. i.e., at the time of execution of code.
        // it happens when there are bugs such as logic errors, improper use of an API.
        // they are ignored at the time of compilation.
    }
}
