package JavaCore3;

public class App2 {
    public static void main(String[] args) {
        Коло коло = new Коло();
        Коло коло1 = new Коло(1.1, 3.3);
        System.out.println("Площа кола = " + коло1.squareCircle());
        System.out.println("Довжина кола = " + коло1.circleLength());
    }
}
