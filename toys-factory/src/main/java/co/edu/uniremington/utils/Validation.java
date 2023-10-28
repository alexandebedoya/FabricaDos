package co.edu.uniremington.utils;

public class Validation {

    public static boolean isNumber(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
