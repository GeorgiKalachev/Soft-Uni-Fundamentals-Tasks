package DataTypesAndVariables;

import java.util.Scanner;

public class CharToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String c1 = scanner.nextLine();
        String c2 = scanner.nextLine();
        String c3 = scanner.nextLine();

        System.out.printf("%s%s%s",c1,c2,c3);
    }
}
