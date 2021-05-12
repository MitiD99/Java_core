package JavaCore4.JavaCore_2;

public class Car {
    private int age;
    private double speed;
    private double weight;
    private Wheel size;
    private Body bodyСapacity;
    private SteeringWheel diametr;

    public Car(int age, double speed, double weight, Wheel size, Body bodyСapacity, SteeringWheel diametr) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.size = size;
        this.bodyСapacity = bodyСapacity;
        this.diametr = diametr;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed() {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public Wheel getSize() {
        return size;
    }

    public void setSize(Wheel size) {
        this.size = size;
    }

    public Body getBodyСapacity() {
        return bodyСapacity;
    }

    public void setBodyСapacity() {
        this.bodyСapacity = bodyСapacity;
    }

    public SteeringWheel getDiametr() {
        return diametr;
    }

    public void setDiametr(SteeringWheel diametr) {
        this.diametr = diametr;
    }

    public void changeAge(int age1) {

        age = age1;
    }

    public void changeSpeed(double speed1) {

        speed = speed1;
    }

    public void changeWeight(double weight1) {

        weight = weight1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", speed=" + speed +
                ", weight=" + weight +
                ", size=" + size +
                ", bodyСapacity=" + bodyСapacity +
                ", diametr=" + diametr +
                '}';
    }

}
