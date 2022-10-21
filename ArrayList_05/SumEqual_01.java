package ArrayList_05;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumEqual_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Double :: parseDouble).collect(Collectors.toList());

        for (int i = 0; i < nums.size()-1; i++) {
            double currentNum = nums.get(i);
            double nextNum = nums.get(i+1);

            if (currentNum == nextNum){
                nums.set(i, currentNum+nextNum);
                nums.remove(i+1);
                i = -1;
            }
        }
        System.out.println(joinElementsbyDel(nums," "));
    }
    public static String joinElementsbyDel(List<Double> list,String delimeter){
        DecimalFormat df = new DecimalFormat("0.#");
        StringBuilder result = new StringBuilder();
        for (double item: list) {
            String numDf = df.format(item)+delimeter;
            result.append(numDf);

        }
        return result.toString();
    }
}
