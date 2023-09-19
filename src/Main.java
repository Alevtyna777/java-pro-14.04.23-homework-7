import utils.FindingSymbolOccurance;

public class Main {
    //Public -Це впливає на область видимості класу
    // Результат, який повинен бути: Створи змінну цього класу у мейн і викличе цей метод
    // Main -вхідна точка програми, тому є сенс викликати метод тут
    //public static void main(String[] args) {
    // char - character- символ

    //? is this code correct? System.out.println("The symbol '" + symbol + "' occurs " + occurrences + " times in the input string.");
    //str.charAt(0); - метод, поверне char, який стоїть у слові str на першій позиції
    // //У мене є утилітарний клас StringUtils  за допомогою якого я можу викликати метод який мені завгодно
    //треба створити метод і туди передати рядок(Стрінг) і символ(чар) і повернути скільки разів зустрічається цей символ

    // public class SymbolCounter {
        public static int findSymbolOccurance(String inputString, char symbol) {
            // Ініціалізуємо лічильник для підрахунку кількості входжень символу
            int count = 0;
            //Значення i++ або ++i. Ця операція називається інкрементом. Існує 2 види: «префіксный інкремент», тобто ++i та «постфіксный інкремент»,  тобто i++. Приклад для покращення сприйняття:
            //
            //1
            //2
            //3
            //int a,i = 7;
            //a = ++i;
            //System.out.println("a = " + a + "\ni = " + i);
            //Я збільшила  на 1, тобто i = 8, потім a присвоїли i. та. 'a' дорівнює 8
            //
            //Консоль виводить та відображає:
            //
            //a = 8
            //i = 8
            // Проходимо через кожен символ у рядку
            for (int i = 0; i < inputString.length(); i++) {
                // Отримуємо поточний символ
                char currentChar = inputString.charAt(i);

                // Якщо поточний символ співпадає з заданим символом,збільшуємо лічильник на 1
                // == Оператор використовуэтьсядля перевірки,що два рядки вказують на один і той же об'єкт
                if (currentChar == symbol) {
                    count++;
                }
            }

            // Повертаємо кількість входжень символу у рядок
            return count;
        }

        public static void main(String[] args) {
            String inputString = "Це є приклад рядка, в якому ми шукаємо символ 'а'.";
            char symbolToFind = 'а';
            int occurrences = findSymbolOccurance(inputString, symbolToFind);
            System.out.println("Символ '" + symbolToFind + "' зустрічається у рядку " + occurrences + " разів.");
        }
    }




