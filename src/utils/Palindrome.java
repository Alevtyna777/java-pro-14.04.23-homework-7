package utils;

public class Palindrome {
    public static boolean Palindrome(String input) {
        String reversed = new StringReverse(input.toLowerCase()).toString(); // Переводимо у нижній регістр для ігнорування регістру
        return input.toLowerCase().equals(reversed);
    }
}
