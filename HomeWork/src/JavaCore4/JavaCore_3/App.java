package JavaCore4.JavaCore_3;

public class App {
    public static void main(String[] args) {

        Animal a= new Animal("Леопард", 20, 7);
        System.out.println("Назва тварини = " + a.getName() + ", Швидкість тварини = " + a.getSpeed() +" км/год"+ ", Вік тварини = " + a.getAge() + " років;");

        System.out.println("-----------------------------------------------------------------------------");

        a.setName("Бик");
        a.setSpeed(2);
        a.setAge(14);
        System.out.println("Назва тварини = " + a.getName() + ", Швидкість тварини = " + a.getSpeed() +" км/год"+ ", Вік тварини = " + a.getAge() + " років;");
    }
}
