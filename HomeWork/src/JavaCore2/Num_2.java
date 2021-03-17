package JavaCore2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Num_2 {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        System.out.println("Запишіть 5 чисел: ");
        Scanner arr = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int sc = arr.nextInt();
            num.add(sc);
        }
        System.out.println(num);
        Collections.reverse(num);
        System.out.println(num);
    }
}