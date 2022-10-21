package Arr.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[n];
        String[] secArray = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] nums = scanner.nextLine().split(" ");
            if (i % 2 == 0){
                secArray[i - 1] = nums[0];
                firstArray[i-1] = nums[1];
            }else{
                secArray[i - 1] = nums[1];
                firstArray[i-1] = nums[0];
            }

        }
        System.out.println(String.join(" ",firstArray));
        System.out.println(String.join(" ",secArray));

    }
}
