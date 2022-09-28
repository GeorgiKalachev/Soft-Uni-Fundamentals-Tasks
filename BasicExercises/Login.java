package FirstMoreExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length()-1; i >= 0; i--) {
            char symbol = username.charAt(i);
            password += symbol;
        }


        String enteredPass = scanner.nextLine();
        for (int i = 0; i < 4; i++) {

            if (enteredPass.equals(password)){
                System.out.printf("User %s logged in.",username);
                break;
            }
            if (i == 3){
                System.out.printf("User %s blocked!",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPass = scanner.nextLine();
        }

    }
}
