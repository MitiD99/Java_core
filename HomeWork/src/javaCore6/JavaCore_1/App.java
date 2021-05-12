package JavaCore6.JavaCore_1;

public class App {
    public static void main(String[] args) {
        MonthWorker monthWorker = new MonthWorker(2000);
        HourWorker hourWorker = new HourWorker(10, 136);
        System.out.println("Заробітня плата першого працівника: ");
        monthWorker.salary();
        System.out.println("Заробітня плата другого працівника: ");
        hourWorker.salary();

    }
}
