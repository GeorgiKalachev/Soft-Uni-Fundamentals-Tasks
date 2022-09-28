package FirstMoreExercise;

import java.util.Scanner;

public class Padawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	The amount of money George Lucas has – the floating-point number in the range [0.00…1,000.00].
        //•	The count of students – integer in the range [0…100].
        //•	The price of lightsabers for a single saber – the floating-point number in the range [0.00…100.00].
        //•	The price of robes for a single robe – the floating-point number in the range [0.00…100.00].
        //•	The price of belts for a single belt – the floating-point number in the range [0.00…100.00].

        double moneyGoerge = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        int lights = 0;
        int robes = 0;
        int belts = 0;

        for (int i = 1; i <= students; i++) {
            lights += 1;
            robes += 1;
            belts += 1;
            if (i%6==0){
                belts -= 1;
            }
        }
        lights = (int) Math.ceil(lights * 1.10);
        double finalSum = (lights*lightPrice) + (robes*robesPrice) + (beltsPrice*belts);

        if (finalSum <= moneyGoerge){
            System.out.printf("The money is enough - it would cost %.2flv.",finalSum);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",finalSum-moneyGoerge);
        }
    }
}
