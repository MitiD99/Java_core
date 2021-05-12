package javaCore11;
/*
Зробити валідацію для емейл-адрес, зберігати лише ті, які закінчуються на @gmail.com
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Num2 {
    public static void main(String[] args) {
    int a = emailAddress();
        List<String> list = new ArrayList<>();
        System.out.println(writeEmail(list, a));
    
    }

    private static int emailAddress() {
        System.out.println("Назвіть ількість електронних адрес: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;

    }
    public static List<String> writeEmail(List<String> list, int a){
        for (int i = 0; i<a; i++){
            System.out.print("Email №" + (i + 1));

            Scanner sc = new Scanner(System.in);
            String email = sc.next();
            String end = "@gmail.com";
            Pattern p = Pattern.compile(end);
            Matcher m = p.matcher(email);
            if (m.find()){
                list.add(email);
            }

        }
        return list;
    }

}
