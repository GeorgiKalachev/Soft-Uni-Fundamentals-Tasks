package DataTypesAndVariables;

import java.util.Scanner;

public class ContactNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstName = scanner.nextLine().charAt(0);
        char sec = scanner.nextLine().charAt(0);
        char th = scanner.nextLine().charAt(0);


        System.out.printf("%c %c %c",th,sec,firstName);
    }
}
