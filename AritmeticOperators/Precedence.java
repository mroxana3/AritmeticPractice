package AritmeticOperators;

public class Precedence {
    public static void main(String[] args) {
        int count = 10 + 5;
        int count1 = 10 + 5 * 2;
        System.out.println("count" + count);
        System.out.println(count1);
        int count2 = count1 - count / 5 - 1 * 3 + 4 * count;
        System.out.println(count2);
        int count3 = count1 - count / ((5-1*3)+ 4* count);
        System.out.println(count3);
    }
}
