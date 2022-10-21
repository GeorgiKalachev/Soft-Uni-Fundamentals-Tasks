package Methods_04_exercise;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        int chars = 0;
        int digits = 0;
        boolean isFalse = false;

        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i) > 47 && password.charAt(i) < 58  ){
                digits += 1;
            }else if (password.charAt(i) > 64 && password.charAt(i) < 91 || password.charAt(i) > 96 && password.charAt(i) < 123){
                chars += 1;
            }else {
                isFalse = true;
            }
        }

        if (password.length() < 6 || password.length() > 10){
            System.out.println("Password must be between 6 and 10 characters");
        }if (isFalse){
            System.out.println("Password must consist only of letters and digits");
        }if (digits < 2){
            System.out.println("Password must have at least 2 digits");
        } if(chars + digits > 5 && chars + digits < 11 && digits > 1 && !isFalse){
            System.out.println("Password is valid");
        }

    }

}
