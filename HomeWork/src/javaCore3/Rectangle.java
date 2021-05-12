package JavaCore3;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double Square() {
        return length * width;
    }

    public double Perimeter() {
        return (length + width) * 2;
    }
}
