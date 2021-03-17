package JavaCore3;

public class Коло {
    private double radius;
    private double diameter;

    public Коло(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public Коло() {

    }

    public double circleLength() {
        return 2 * radius * Math.PI;

    }
    public double squareCircle() {
        return diameter * diameter / 4 * Math.PI;
    }

}
