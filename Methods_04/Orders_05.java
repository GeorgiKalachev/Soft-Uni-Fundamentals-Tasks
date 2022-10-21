package Methods_04;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());

        calculate(product,price);

    }
    public static void calculate(String product,double count){
        switch (product){
            case "coffee":
                System.out.printf("%.2f",count * 1.50);
                break;
            case "water":
                System.out.printf("%.2f", count);
                break;
            case "coke":
                System.out.printf("%.2f",count * 1.40);
                break;
            case "snacks":
                System.out.printf("%.2f",count * 2.00);
                break;
        }
    }
}
