package ArrayList_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Merging_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numList2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> arrList = new ArrayList<>();

        int minSize = Math.min(numList1.size(), numList2.size());

        for (int i = 0; i < minSize; i++) {
            int firstNum = numList1.get(i);
            int secNum = numList2.get(i);

            arrList.add(firstNum);
            arrList.add(secNum);
        }
        if(numList1.size()> numList2.size()){
            arrList.addAll(numList1.subList(minSize, numList1.size()));
        }else {
            arrList.addAll(numList2.subList(minSize, numList2.size()));
        }

        for (int item:arrList) {
            System.out.print(item + " ");
        }
    }
}
