package Methods_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        DecimalFormat dc = new DecimalFormat("0.####");
        System.out.println(dc.format(mathPower(input,power)));

    }

    public static double mathPower(double input, double power){

        double result = 1;

        for (int i = 0; i < power; i++) {
            result *= input;
        }
        return result;
    }
}
