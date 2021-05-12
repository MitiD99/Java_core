package javaCore11;
/*
Завдання(1, 2) робити через RegEx
        Користувач вводить слова з консолі, в масив додавати лише ті, що починаються на “a”.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Num1 {
    public static void main(String[] args) {
        int a = word();
        List<String> list = new ArrayList<>();
        System.out.println(write(list, a));
    }

    private static int word() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Назвіть кількість слів для вводу танатисніть \"Enter\":");
        int a = scanner.nextInt();
        return a;
    }

    public static List<String> write(List<String> list, int a) {
        for (int i = 0; i < a; i++) {
            String str;
            Scanner sc = new Scanner(System.in);
            str = sc.next();
            String s = "^a";
            Pattern pattern = Pattern.compile(s);
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                list.add(str);
            }

        }
        return list;
    }
}
