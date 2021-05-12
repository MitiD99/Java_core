package JavaCore4.JavaCore_1;

public class App {
    public static void main(String[] args) {

        Robot[] arr = new Robot[4];
        arr[0] = new Robot();
        arr[1] = new RobotCoocker();
        arr[2] = new CoffeRobot();
        arr[3] = new RobotDancer();

        for (int i = 0; i < arr.length; i++) {
            arr[i].work();
        }
    }
}