package Arrays;

import java.util.Scanner;

public class CompareIntArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrOne = scanner.nextLine().split(" ");
        String[] arrTwo = scanner.nextLine().split(" ");

        int sum = 0;
        boolean flag = true;
        for (int i = 0; i < arrOne.length; i++) {
            int numOne = Integer.parseInt(arrOne[i]);
            int numTwo = Integer.parseInt(arrTwo[i]);

            if (numOne == numTwo) {
                sum += numOne;
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
