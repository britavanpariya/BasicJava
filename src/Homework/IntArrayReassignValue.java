package Homework;

public class IntArrayReassignValue {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        numbers[6]=100;
        System.out.println(numbers[6]);

        for (int i = 0; i <= (numbers.length - 1); i++) {
            System.out.println(i);
        }
    }
}

