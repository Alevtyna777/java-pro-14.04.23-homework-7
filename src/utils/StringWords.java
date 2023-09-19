package utils;

import java.util.Random;
import java.util.Scanner;

public class StringWords { public  void Random() {

    }


    public static class WordGuessGame {
        public static void main(String[] args) {
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

            Random random = new Random();
            String secretWord = words[random.nextInt(words.length)];

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Введіть слово:");
                String userGuess = scanner.nextLine().toLowerCase();

                if (userGuess.equals(secretWord)) {
                    System.out.println("Ви виграли! Загадане слово: " + secretWord);
                    break;
                } else {
                    String result = "";
                    for (int i = 0; i < 15; i++) {
                        if (i < userGuess.length() && i < secretWord.length() && userGuess.charAt(i) == secretWord.charAt(i)) {
                            result += secretWord.charAt(i);
                        } else {
                            result += "#";
                        }
                    }
                    System.out.println(result);
                }
            }
        }
    }
}
