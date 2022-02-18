package Primitives;

public class Farm {
    public static void main(String[] args) {
        /* 1 - calc numbers of teh legs in the farm if :
        there are 23 cows and 13 chicken at this farm
        show total number of legs as final result
         */

        int cows =23;
        int chickens =13;
        int cowslegs =4;
        int chickenslegs =2;
        int totallegs = cows * cowslegs + chickenslegs* chickens;

        System.out.println(totallegs);
 /* 2 . calculate the cost of teh animals if:
        each cow cost 1200$ and each chicken cost 15$ */


        double cowCost$ = 1200;
        double chickenCost$ = 15.99;
        double totalCost$ = cows * cowCost$ + chickens * chickenCost$;
                System.out.println("Total cost of the animals in this farm = $" + totalCost$);

    }
}
