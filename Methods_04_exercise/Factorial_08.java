package Methods_04_exercise;

import java.util.Scanner;

public class Factorial_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        long fac1 = factorial(n1);
        long fac2 = factorial(n2);

        double divisionResult = fac1 * 1.0 / fac2;
        System.out.printf("%.2f",divisionResult);

    }

    public static long factorial(int n1){
        long sum = 1;
        for (int i = 1; i <= n1 ; i++) {
            sum *= i;
        }
        return sum;
    }

}
