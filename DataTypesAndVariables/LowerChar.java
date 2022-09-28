package DataTypesAndVariables;

import java.util.Scanner;

public class LowerChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.nextLine().charAt(0);

        boolean lowerCase = Character.isLowerCase(ch);

        if (lowerCase){
            System.out.println("lower-case");
        }else {
            System.out.println("upper-case");
        }
    }
}
