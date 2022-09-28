package FirstMoreExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (type){
            case "Students":
                if (day.equals("Friday")){
                    price = num * 8.45;
                }else if (day.equals("Saturday")){
                    price = num * 9.80;
                }else if (day.equals("Sunday")){
                    price = num * 10.46;
                }
                if (num >= 30){
                    price *= 0.85;
                }

                break;
            case "Business":
                if (day.equals("Friday")){
                    price = num * 10.90;
                    if (num >= 100) {
                        price -= 109;
                    }
                }else if (day.equals("Saturday")){
                    price = num * 15.60;
                    if (num >= 100) {
                        price -= 156;
                    }
                }else if (day.equals("Sunday")){
                    price = num * 16;
                    if (num >= 100) {
                        price -= 160;
                    }
                }

                break;
            case "Regular":
                if (day.equals("Friday")){
                    price = num * 15;
                }else if (day.equals("Saturday")){
                    price = num * 20;
                }else if (day.equals("Sunday")){
                    price = num * 22.50;
                }
                if (num > 9 && num < 21){
                    price *= 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f",price);




    }
}
