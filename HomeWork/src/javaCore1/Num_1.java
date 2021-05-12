package JavaCore1;

public class Num_1 {
    public static void main(String[] args) {
        double a, b, c; //a*x^2+bx+c=0
        a = 1;
        b = 10;
        c = 3;
        double discr = b * b - 4 * a * c;
        if (discr > 0) {
            double x = (-b + Math.sqrt(discr)) / 2 * a;
            double x1 = (-b - Math.sqrt(discr)) / 2 * a;
            System.out.printf("x = %s, x1 = %s", x, x1);
        } else if (discr == 0) {
            double x = (-b) / (2 * a);
            System.out.println(x);
        } else if (discr < 0) {
            System.out.println("Нет корней");
        }
    }
}
