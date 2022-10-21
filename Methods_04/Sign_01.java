package Methods_04;

import java.util.Scanner;

public class Sign_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = Integer.parseInt(scanner.nextLine());

        printNumSign(numInput);

    }

    public static void printNumSign(int num) {
        if (num < 0){
            System.out.printf("The number %d is negative.",num);
        }else if(num > 0){
            System.out.printf("The number %d is positive.",num);
        }else {
            System.out.printf("The number %d is zero.",num);
        }
    }
}
