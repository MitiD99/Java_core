package javaCore12;
/*Користувач з консолі має вводити слова доти, доки не введе “break”, всі слова записуються в List.
        Написати функцію для :

       * виведення користувачу всіх слова, які він ввів!
       * виведення слів, які починаються на “s”!
       * виведення слів, які мають кількість букв більше ніж 5!*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        enterWords(list);
        startS(list);
        numMore5(list);
        System.out.println("Вводьте слова, а для закінчення введіть \"break\": ");
    }

    public static void enterWords(List<String> list) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (!str.equals("break")) {
            list.add(str);
            str = scanner.nextLine();
        }
        System.out.println("Виведення всіх слів: ");
        System.out.println(list);
    }

    public static void startS(List<String> list) {
        for (String s : list) {
            if (s.startsWith("s")) {
                System.out.println("Виведення слів, які починаються на \"s\": ");
                System.out.println(s);
            }
        }
    }

    public static void numMore5(List<String> list) {
        for (int a = 0; a < list.size(); a++) {
            String string = list.get(a);
            if (string.length() > 5) {
                System.out.println("Слова, які мають більше 5 букв: ");
                System.out.println(string);
            }
        }
    }


}
