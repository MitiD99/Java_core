package JavaCore4.JavaCore_2;

public class Wheel {
    private double size;

    public Wheel(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public void changeSize(double size1) {
        size1 = size * 1.1;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                '}';
    }
}
