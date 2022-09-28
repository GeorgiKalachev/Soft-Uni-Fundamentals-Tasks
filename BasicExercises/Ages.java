package FirstMoreExercise;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());

        //· 0-2 – baby;
        //· 3-13 – child;
        //· 14-19 – teenager;
        //· 20-65 – adult;
        //· >=66 – elder;

        if(age <= 2){
            System.out.println("baby");
        }if (age >= 3 && age < 14){
            System.out.println("child");
        }if (age > 13 && age < 20) {
            System.out.println("teenager");
        }if (age > 19 && age < 66) {
            System.out.println("adult");
        }if (age > 65) {
            System.out.println("elder");
        }
    }
}
