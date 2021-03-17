package JavaCore2;

import java.util.Scanner;

public class Num_1 {
    public static void main(String[] args) {
        System.out.println("Сума");
        Scanner sc = new Scanner(System.in);
            double money = sc.nextInt();
        System.out.println("Відсоток");
            double n = sc.nextInt();
        System.out.println("Кількість років");
            double k = sc.nextInt();


            double result = money * (1 + n / 100 * k);  // простой %

        System.out.println("Кінцевий розмір вкладу: " +result);

    }


}
