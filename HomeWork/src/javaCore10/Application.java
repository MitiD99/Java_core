package javaCore10;
/*1)
        а) Ініціалізувати стрічку : String str = "I like Java !!!".
        б) Роздрукувати останній символ рядка. Використовуємо метод
        в) Перевірити, чи закінчується ваша рядок підрядком "!!!".
        г) Перевірити, чи починається ваша рядок підрядком "I like".
        д) Перевірити, чи містить ваша рядок підрядок "Java".
        e) Знайти позицію підрядка "Java" в рядку "I like Java !!!".
        ж) Замінити всі символи "а" на "о".
        з) Перетворіть рядок до верхнього регістру.
        і) Перетворіть рядок до нижнього регістру.
        к) Вирізати рядок Java c допомогою методу String.substring() .*/

public class Application {
    public static void main(String[] args) {
        String str = "I like Java !!!";
        System.out.println("Роздрукувати останній символ рядка: ");
        int last = str.length() - 1; // вказуємо довжину рядка
        char ch = str.charAt(last); // повертаємо останній символ в рядку
        System.out.println(ch);
        //  System.out.println("Last char = " + str.charAt(str.length() - 1));

        System.out.println("Перевірити, чи закінчується рядок підрядком \"!!!\":");
        boolean endStr = str.endsWith("!!!"); //
        System.out.println(endStr);

        System.out.println("Перевірити, чи починається рядок підрядком \"I like\":");
        boolean startStr = str.startsWith("I like");
        System.out.println(startStr);

        System.out.println("Перевірити, чи містить рядок підрядок \"Java\":");
        boolean isContain = str.contains("Java");
        System.out.println(isContain);

        System.out.println("Знайти позицію підрядка \"Java\" в рядку \"I like Java !!!\"");
        int numWord = str.indexOf("Java");
        System.out.println(numWord);

        System.out.println("Замінити всі символи \"а\" на \"о\"");
        String newStr = str.replace("a", "o");
        System.out.println(newStr);

        System.out.println("Перетворіть рядок до верхнього регістру:");
        str = str.trim(); // прибираємо порожні строки у кінці рядка
        System.out.println(str.toUpperCase());

        System.out.println("Перетворіть рядок до нижнього регістру:");
        System.out.println(str.toLowerCase());

        System.out.println("Вирізати рядок Java c допомогою методу String.substring():");
        String sub = str.substring(7, str.length() - 4);
        System.out.println(sub);
    }
}
