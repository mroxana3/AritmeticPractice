package AritmeticOperators;

public class RemainderPractice {
    public static void main(String[] args) {

        /*
        456 ---> 4+5+6 --> sum (sum of digits is 15)
         */
        int num = 456;
        int digit = 456 % 10;
        num= num/10;
        int digit1 = num%10;
        num = num/10;
        int digit2 = num % 10;


System.out.println(digit);

System.out.println(digit1);
        System.out.println(digit2);  //   5
        int sum0fDigits = digit + digit1+ digit2;
        System.out.println(sum0fDigits);
    }
}
