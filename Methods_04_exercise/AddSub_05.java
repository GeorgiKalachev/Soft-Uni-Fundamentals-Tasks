package Methods_04_exercise;

import java.util.Scanner;

public class AddSub_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int sum = sum(a,b);
        int subtract = sub(sum,c);

        System.out.println(subtract);

    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
}
