package Methods_04;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int b = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "+":
                add(a,b);
                break;
            case "*":
                multiply(a,b);
                break;
            case "-":
                subtract(a,b);
                break;
            case "/":
                divide(a,b);
                break;
        }
    }
    //("add", "multiply", "subtract", "divide")
    public static void add(int a,int b){
        System.out.print(a+b);
    }
    public static void multiply(int a,int b){
        System.out.print(a*b);
    }
    public static void subtract(int a,int b){
        System.out.print(a-b);
    }
    public static void divide(int a,int b){
        System.out.print(a/b);
    }
}
