package javaCore10;
/*
2)Ввести n слів з консолі. Знайти найдовше і найкоротше слово та вказати яким воно було введено(порядковий номер).
*/

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Назвіть кількість слів для вводу танатисніть \"Enter\":");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("Помилка! Повторіть спробу: ");
            return;
        }
        String[] str = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку №" + (i + 1));
            str[i] = scanner.nextLine();
        }
        System.out.println();
        for (String key : str) {
            System.out.println("Ваші слова:");
            System.out.println(key);
        }
        int maxIndex = 0;
        String max = str[0];
        for (int a = 1; a < n; a++) {
            if (max.length() < str[a].length()) {
                maxIndex = a;
                max = str[a];
            }
            System.out.println("Найдовше слово: " + max + " Індекс: " + maxIndex);
        }
        int minIndex = 0;
        String min = str[0];
        for (int a = 1; a < n; a++) {
            if (min.length() > str[a].length()) {
                minIndex = a;
                min = str[a];
            }
            System.out.println("Найкоротше слово: " + min + " Індекс: " + minIndex);
        }
    }

}
