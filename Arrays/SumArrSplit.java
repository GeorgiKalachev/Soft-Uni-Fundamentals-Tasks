package Arrays;

import java.util.Scanner;

public class SumArrSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");

        int sum = 0;
        for (String value : values) {
            int num = Integer.parseInt(value);
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);

    }
}
