package JavaCore1;

public class Num_6 {
    public static void main(String[] args) {
        int[] num = {3, 2, 7, 1000000, 33, 79, 55};
        int max = num[0];
        int min = num[0];
        for (int i = 0; i != num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Самое большое значение ряда " + max + " Самое маленькое значене ряда " + min);

    }
}

