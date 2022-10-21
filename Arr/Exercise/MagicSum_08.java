package Arr.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int magic = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= nums.length-1 ; i++) {


            for (int j = i + 1; j <= nums.length -1 ; j++) {


                if ( nums[i] + nums[j] == magic ){
                    System.out.println(nums[i] + " " + nums[j]);
                }
            }
        }
    }
}
