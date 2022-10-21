package Methods_04_exercise;

import java.util.Scanner;

public class Smallest_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(result(a,b,c));
    }
    public static int result(int a, int b, int c){
        if (a<b && a<c){
            return a;
        }if (b<a && b<c){
            return b;
        }else {
            return c;
        }
    }
}
