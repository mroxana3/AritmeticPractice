package AritmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int num = 9;
         // addition
        int sum = num + 3; // sum ->12

        System.out.println(sum);

        int num1 = 34;
         // substraction
        int result =  sum - num1;//  - 22
                System.out.println(result);

                double result1 = sum - num;
                System.out.println(result1); // 3

        // multiplication -->
       double multiply =  result1 * sum; //  36

        int multiply1 = 5*8;
       System.out.println(multiply1); // 40

        // division -->

        int num2 = 12;
        int num3 = 4;
      float division = num2/num3;
      System.out.println(division);

      double division1 = num2/2.5;
      System.out.println(division1);

      int division3 = 15/4;
      System.out.println(division3); // 3

        double division4 = 15/4d;
        System.out.println(division4);


        // modulus (remainder) --> % ---  find remainder of division problem
        int remainder = 15 % 6;
        System.out.println(remainder);
        double remainder2 = 6 % 4;
        System.out.println(remainder2);

        int x = 12, a = 5, b = x + a, k = b /2;
        System.out.println(k-a );
         int people = 10;
         int burgers = 45;
         int leftoverBurgers = burgers % people;

System.out.println(leftoverBurgers + " burgers left over after people shared them evenly");



        //


    }
}
