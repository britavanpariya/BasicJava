package Lecture6MethodsAndStrings;

public class PreDefinedMethods {
    public static void main(String[] args) {
        String name = "Brita";
        String lastname = "Vanpariya";
        String fullname = name + lastname;
        String firstSection ="Women";


        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.concat(lastname));
        System.out.println(name.equals("brita"));
        System.out.println(name + lastname);
        System.out.println(firstSection.equals("Women"));
        System.out.println(name.length());
        System.out.println(lastname.length());
        System.out.println(name.isEmpty());
        System.out.println(name.replace('a', 't'));
        System.out.println(fullname.toLowerCase());
        System.out.println(fullname.toUpperCase());

    }
}
