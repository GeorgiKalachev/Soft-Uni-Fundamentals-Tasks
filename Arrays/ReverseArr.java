package Arrays;

import java.util.Scanner;

public class ReverseArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
