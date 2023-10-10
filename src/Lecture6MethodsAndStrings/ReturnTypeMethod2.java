package Lecture6MethodsAndStrings;

public class ReturnTypeMethod2 {
    //balance
    //withdraw
    //Remaining Balance
    static int balance = 1000;
    public static void main(String[] args) {
        moneyWithdraw(500);
        System.out.println(balance);
        moneyWithdraw(200);
        System.out.println(balance);
        moneyDeposit(1000);
        System.out.println(balance);

        double totalInterestGain = bankScheme(balance);
        System.out.println(totalInterestGain);


    }
    public static void moneyWithdraw(int withdraw) {
        balance = balance - withdraw;
    }
    public static void moneyDeposit(int deposit){
        balance = balance + deposit;
    }
    public static double bankScheme(double balance){
        double totalInterestGain = (balance*5)/100;
        return totalInterestGain;
    }
}
