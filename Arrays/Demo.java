package Arrays;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2 15 33 5 18 26 55

        String values = scanner.nextLine();
        String[] valArr = values.split(" ");

        int[] numArr = new int[valArr.length];
        for (int i = 0; i < valArr.length; i++) {
            numArr[i] = Integer.parseInt(valArr[i]);
        }
    }
}
