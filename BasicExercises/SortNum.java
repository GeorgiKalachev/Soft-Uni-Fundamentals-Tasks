package FirstMoreExercise;

import java.util.Scanner;

public class SortNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());

        if ( one > two && one > three){
            System.out.println(one);
            if ( two > three){
                System.out.println(two);
                System.out.println(three);
            }else {
                System.out.println(three);
                System.out.println(two);
            }
        }

        if ( two > one && two > three){
            System.out.println(two);
            if ( one > three){
                System.out.println(one);
                System.out.println(three);
            }else {
                System.out.println(three);
                System.out.println(one);
            }
        }
        if ( three > one && three > two){
            System.out.println(three);
            if ( one > two){
                System.out.println(one);
                System.out.println(two);
            }else {
                System.out.println(two);
                System.out.println(one);
            }
        }



    }
}
