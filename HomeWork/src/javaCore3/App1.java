package JavaCore3;

public class App1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(1.1, 2.3);
        System.out.println("Площа прямокутника = " + rectangle1.Square());
        System.out.println("Периметр прямокутника = " + rectangle1.Perimeter());
    }
}
