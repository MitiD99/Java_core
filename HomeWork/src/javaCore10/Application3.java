package javaCore10;
/*
3)Ввести n слів з консолі. Вивести на екран слова які починаються на ‘a’ і мають парну кількість символів.
*/

import java.util.Scanner;

public class Application3 {
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
            System.out.println("Введіть слово №" + (i + 1));
            str[i] = scanner.nextLine();
        }
        System.out.println();
        for (String key : str) {
            System.out.println("Ваші слова:");
            System.out.println(key);
        }
        for (int a = 0; a < n; a++) {
            boolean str1 = (str[a].startsWith("a"));
            boolean str2 = (((str[a].length()) % 2) == 0);
            if ((str1 == true) && (str2 == true)) {
                System.out.println("Слова які починаються на ‘a’ і мають парну кількість символів: " + str[a]);
            }

        }
    }
}

