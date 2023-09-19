package utils;

public class StringReverse {
    public StringReverse(String lowerCase) {
    }

    public static String stringReverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
