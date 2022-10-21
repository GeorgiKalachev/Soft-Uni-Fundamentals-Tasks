package Methods_04;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        printRepeat(word,n);

    }
    public static void printRepeat(String word,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(word);
        }
    }
}
