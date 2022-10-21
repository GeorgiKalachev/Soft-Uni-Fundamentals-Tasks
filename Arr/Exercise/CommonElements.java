package Arr.Exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secArr = scanner.nextLine().split(" ");

        for (String element :secArr) {

            for (String elementFirst:firstArr) {

                if (element.equals(elementFirst)){
                    System.out.print(elementFirst + " ");
                break;
                }
            }
        }

    }
}
