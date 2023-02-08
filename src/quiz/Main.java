package quiz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);

        int convert;
        if (longVal != null) {
            convert = longVal.intValue();
        } else if (longVal >= Integer.MAX_VALUE) {
            convert = Integer.MAX_VALUE;

        } else if (longVal <= Integer.MAX_VALUE) {
            convert = Integer.MAX_VALUE;
        } else {
            convert = 0;
        }

        System.out.println(convert);
    }
}
