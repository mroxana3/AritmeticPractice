package AritmeticOperators;

public class remainderPractice2 {
    public static void main(String[] args) {

        /* phone$ = 986
        decided to make monthly payments of 100
        find out last months and show ir
         */

        int phone$ = 986;
        int monthlypayment = 100;
        int lastmonth = phone$ % monthlypayment;
        System.out.println(lastmonth);
    }
}
