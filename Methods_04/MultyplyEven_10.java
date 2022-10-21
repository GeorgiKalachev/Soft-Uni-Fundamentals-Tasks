package Methods_04;

import java.util.Scanner;
import java.util.Arrays;

public class MultyplyEven_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultiple(n));

    }
    private static int getMultiple(int n){
            return evenNums(n) * oddNums(n);
    }
    private static int evenNums(int n){
        String intToString = Integer.toString(n);

        int[] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        return sum;
    }
    public static int oddNums(int n){
        String intToString = Integer.toString(n);

        int[] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }

        return sum;
    }
}
