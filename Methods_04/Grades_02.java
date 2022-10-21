package Methods_04;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        printGrade(grade);
    }

    public static void printGrade(double grade){
        if (grade < 3.00){
            System.out.print("Fail");
        }if (grade >= 3.00 && grade < 3.50){
            System.out.print("Poor");
        }if (grade >= 3.50 && grade < 4.50){
            System.out.print("Good");
        }if (grade >= 4.50 && grade < 5.50){
            System.out.print("Very good");
        }if (grade >= 5.50 && grade <= 6.00){
            System.out.print("Excellent");
        }

    }
}
