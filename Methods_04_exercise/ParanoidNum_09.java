package Methods_04_exercise;

import java.util.Scanner;

public class ParanoidNum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();

        do {
            if (isPalindrome(num)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            num = scanner.nextLine();

        }while (!num.equals("END"));

    }
    public static boolean isPalindrome(String num){
        StringBuilder reversed = new StringBuilder();
        for (int i = num.length() -1; i >= 0; i--) {
            reversed.append(num.charAt(i));
        }
        return reversed.toString().equals(num);
    }
}
