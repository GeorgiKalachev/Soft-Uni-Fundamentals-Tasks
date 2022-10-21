package Arrays;

import java.util.Scanner;

public class EvenOddRed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        int even = 0;
        int odd = 0;

        for (int i = 0; i < array.length ; i++) {
            int num = Integer.parseInt(array[i]);
            if ( num % 2 == 0) {
                even += num;
            }else {
                odd += num;
            }
        }
        System.out.print(even - odd);
    }
}
