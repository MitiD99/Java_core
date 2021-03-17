package JavaCore6.JavaCore_1;

public class MonthWorker implements Salary {
    private static double Salary;

    public MonthWorker(double salary) {
        Salary = salary;
    }

    public double getSalary() {
        return Salary;
    }
    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public void salary() {
        System.out.println(Salary);
    }
}
