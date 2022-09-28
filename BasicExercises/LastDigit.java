package FirstMoreExercise;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] num = new int [scanner.nextInt()];
        int size = num.length;
        System.out.println(num[size-1]);
    }
}
