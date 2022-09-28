package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumRealNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal num = new BigDecimal(0);

        for (int i = 0; i < n; i++) {
            BigDecimal sum = new BigDecimal(scanner.nextLine());
            num = num.add(sum);
        }

        System.out.println(num);
    }
}
