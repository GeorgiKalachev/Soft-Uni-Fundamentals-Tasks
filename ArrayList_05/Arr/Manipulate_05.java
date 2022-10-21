package ArrayList_05.Arr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Manipulate_05 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());

        System.out.println(date);
    }
}
