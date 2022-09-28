package FirstMoreExercise;

import java.util.Scanner;

public class LostGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //•	On the first input line - lost games count – integer in the range [0, 1000].
        //•	On the second line – headset price - the floating-point number in the range [0, 1000].
        //•	On the third line – mouse price - the floating-point number in the range [0, 1000].
        //•	On the fourth line – keyboard price - the floating-point number in the range [0, 1000].
        //•	On the fifth line – display price - the floating-point number in the range [0, 1000].

        int games = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headset = 0;
        int mouse = 0;
        int keyboard = 0;
        int display = 0;

        for (int i = 1; i <= games; i++) {
            if ( i % 2 == 0){
                headset += 1;
            }
            if ( i % 3 == 0){
                mouse += 1;
            }
            if ( i % 2 == 0 && i % 3 == 0){
                keyboard += 1;
                display = (int) Math.floor(keyboard/2);
            }
        }
        double finalSum = (headset*headsetPrice) + (mousePrice*mouse) + (keyPrice*keyboard) + (display*displayPrice);

        System.out.printf("Rage expenses: %.2f lv.",finalSum);
    }
}
