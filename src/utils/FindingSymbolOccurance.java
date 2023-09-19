package utils;

public class FindingSymbolOccurance {


    public FindingSymbolOccurance(String line, char symbol) {
    }

    public static int findSymbolOccurance(String input, char symbol) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == symbol) {
                count++;
            }
        }
        return count;
        //Я  створила об'єкт класу, але навіщо передавати йому значення,чи  краще викличи метод і туди передай їх

    }
}
