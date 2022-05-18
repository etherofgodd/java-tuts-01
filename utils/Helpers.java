package utils;

import java.math.BigDecimal;

public class Helpers {

    public static String generateAccountNumber() {
        return String.valueOf((long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L);
    }

    public static Boolean validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 11) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean compareBigInt(BigDecimal one, BigDecimal two) {
        int res;
        res = one.compareTo(two);
        if (res == 1 && res == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean verifyInput(String input) {
        if (input.length() > 0)
            return true;
        else return false;
    }
}
