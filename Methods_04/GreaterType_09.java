package Methods_04;

import java.util.Scanner;

public class GreaterType_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type){
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(num1,num2));
                break;
            case "char":
                char ch1 = scanner.nextLine().charAt(0);
                char ch2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(ch1,ch2));
                break;
            case "string":
                String symbol1 = scanner.nextLine();
                String symbol2 = scanner.nextLine();
                System.out.println(getMax(symbol1,symbol2));
                break;

        }

    }

    public static int getMax(int num1, int num2){
        return Math.max(num1, num2);
    }
    public static char getMax(char ch1,char ch2){
        if (ch1 > ch2){
            return ch1;
        }else {
            return ch2;
        }
    }
    public static String getMax(String symbol1,String symbol2){
        if (symbol1.compareTo(symbol2) > 0){
            return symbol1;
        }else {
            return symbol2;
        }
    }

}
