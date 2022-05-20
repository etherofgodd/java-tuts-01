package utils;

import java.math.BigDecimal;

public class Helpers {

    public static String generateAccountNumber() {
        return String.valueOf((long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L);
    }

    public static Boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.length() == 11;
    }

    public static Boolean compareBigDecimal(BigDecimal one, BigDecimal two) {
        int res;
        res = one.compareTo(two);
        return res >= 0;
    }

    public static Boolean verifyInput(String input) {
        return input.length() > 0;
    }
}
