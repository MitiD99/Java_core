package JavaCore6.JavaCore_2.second;

import JavaCore6.JavaCore_2.first.Numerable;

public class MyCalculator implements Numerable {
    private double var1;
    private double var2;

    public MyCalculator(double var1, double var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    @Override
    public void devid() {
       double res = var1 / var2;
        System.out.println("Результат ділення: " + res);
    }

    @Override
    public void minus() {
        double res1 = var1 - var2;
        System.out.println("Результат віднімання: " + res1);

    }

    @Override
    public void multiplay() {
        double res2 = var1 * var2;
        System.out.println("Результат множення: " + res2);

    }

    @Override
    public void plus() {
        double res3 = var1 + var2;
        System.out.println("Результат додавання: " + res3);

    }
}
