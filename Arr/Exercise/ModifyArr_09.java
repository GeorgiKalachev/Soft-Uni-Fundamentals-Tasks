package Arr.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ModifyArr_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")){

            if (command.contains("swap")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int element1 = nums[index1];
                int element2 = nums[index2];

                nums[index1] = element2;
                nums[index2] = element1;
            }if(command.contains("multiply")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int element1 = nums[index1];
                int element2 = nums[index2];

                nums[index1] = element1*element2;

            }if (command.equals("decrease")){
                for (int i = 0; i <= nums.length-1; i++) {
                    nums[i] -= 1;
                }
            }

            command= scanner.nextLine();
        }

        for (int i = 0; i <= nums.length-1; i++) {
            int currNum = nums[i];
            if (i != nums.length-1){
                System.out.print(currNum+", ");
            }else {
                System.out.print(currNum);
            }

        }
    }
}
