package JavaCore4.JavaCore_2;

public class SteeringWheel {
    private double diametr;

    public SteeringWheel(double diametr) {
        this.diametr = diametr;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public void changeDiametr(double diametr1) {
        diametr1 = diametr * 8.1;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "diametr=" + diametr +
                '}';
    }
}
