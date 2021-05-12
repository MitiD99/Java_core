package JavaCore1;

public class Num_5 {
    public static void main(String[] args) {
        double a = 19.7;
        double b = 17.9;
        int c = 10;
        double m = Math.abs(c - a);
        double n = Math.abs(c - b);
        if (m == n) {
            System.out.println("Числа на равном растоянии от 10");
        } else if (m > n) {
            System.out.println("Число " + b + " ближе к числу " + c + " чем " + a);
        } else if (n < m) {
            System.out.println("Число " + a + " ближе к числу " + c + " чем " + b);
        }
    }
}
