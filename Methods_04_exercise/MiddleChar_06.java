package Methods_04_exercise;

import java.util.Scanner;

public class MiddleChar_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddle(text);

    }
    public static void printMiddle(String text){
        if(text.length() % 2 == 1){
            int midChar = text.length() / 2;
            System.out.println(text.charAt(midChar));
        }else {
            int firstMid = text.length() / 2 - 1;
            int secMid = text.length() / 2;
            System.out.println(""+text.charAt(firstMid)+text.charAt(secMid));
        }
    }
}
