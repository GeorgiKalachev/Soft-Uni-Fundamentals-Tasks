package Arr.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int firstEl = nums[0];

            for (int index = 0; index < nums.length-1; index++) {
                nums[index] = nums[index +1];
            }

            nums[nums.length-1] = firstEl;
        }
        for (int num:nums) {
            System.out.print(num + " ");
        }

    }
}
