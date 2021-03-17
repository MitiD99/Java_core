package JavaCore6.JavaCore_1;

public class HourWorker implements Salary{

    private int Salary;
    private double hourRate;
    private double time;

    public HourWorker( double hourRate, double time) {

        this.hourRate = hourRate;
        this.time = time;
    }

    @Override
    public void salary() {
      double Salary = hourRate * time;
        System.out.println(Salary);}

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
