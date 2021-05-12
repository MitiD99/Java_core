package JavaCore4.JavaCore_2;

public class App {

    public static void main(String[] args) {
        Car car = new Car(6, 7.8, 8.8, new Wheel(3.3), new Body(4.4), new SteeringWheel(1.1));
        car.getAge();
        car.getSpeed();
        car.getWeight();
        car.getSize();
        car.getBodyСapacity();
        car.getDiametr();

        System.out.println(car);
    }
}


