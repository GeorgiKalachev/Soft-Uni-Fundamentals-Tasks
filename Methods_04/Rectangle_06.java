package Methods_04;

import java.util.Scanner;

public class Rectangle_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f",rectangleArea(a,b));
    }
    public static double rectangleArea(double a, double b){
        return a*b;
    }
}
