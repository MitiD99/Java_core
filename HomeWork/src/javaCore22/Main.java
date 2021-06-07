package javaCore22;
/*Створіть функціональний інтерфейс із методом, який приймає три значення int та повертає значення int.
        Створіть лямбда-функції (як змінні в основному методі), що реалізує цей інтерфейс:
        Перша лямбда повертає максимальне значення
        Друга - середнє значення
        Третя - суму всіх трьох значень
        Викликати ці лямбди.*/

public class Main {
    public static void main(String[] args) {
        // Объявить ссылку на функциональный интерфейс
        IntTernaryOperator intTernaryOperator;
        // перший лямбда-вираз
        // повертає максимальне значення
        intTernaryOperator = (a, b, c) -> (a + b + c) / 3;
        int res1 = intTernaryOperator.something(3, 5, 6);
        System.out.println(res1);
        // другий лямбда-вираз
        // повертає середнє значення
        intTernaryOperator = (a, b, c) -> {
            int res2 = a;
            if (res2 < b) res2 = b;
            if (res2 < c) res2 = c;
            return res2;
        };
        int res2 = intTernaryOperator.something(7, 3, 5);
        System.out.println(res2);
        // третій лямбда-вираз
        //повертає суму всіх трьох значень
        intTernaryOperator = (a, b, c) -> a + b + c;
        int res3 = intTernaryOperator.something(1, 2, 3);
        System.out.println(res3);

    }

}
