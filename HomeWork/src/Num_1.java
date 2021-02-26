public class Num_1 {
    public static void main(String[] args) {
        double a, b, c; //a*x^2+bx+c=0
        a = 1;
        b = 10;
        c = 3;
        double Discr = b*b - 4 * a * c;
        if(Discr > 0) {
            double x = (-b + Math.sqrt(Discr))/2*a;
            double x1 = (-b - Math.sqrt(Discr))/2*a;
            System.out.printf("x = %s, x1 = %s", x, x1);
        } else if (Discr == 0) {
            double x = (-b)/(2 * a);
            System.out.println(x);
        } else if (Discr < 0) {
            System.out.println("Нет корней");
        }
    }
}
