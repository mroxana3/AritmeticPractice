package AritmeticOperators;

public class remainder1 {
    public static void main(String[] args) {

        // 222 --> dinf the product( mulptiplication) of digits from given number
        int num = 358;
              int  dig = num % 10;
                        num= num/10;
                                int dig1 = num % 10;
                                num = num /10;
                                int dig2 = num % 10;
                                        int proDig = dig * dig1 * dig2;
                                System.out.println("The product of given number is " + proDig);
                                System.out.println(dig +"*" + dig1+ "*" + dig2);

    }
}
