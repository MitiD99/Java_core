package JavaCore4.JavaCore_2;

public class Body {
    private double bodyСapacity;

    public Body(double bodyСapacity) {
        this.bodyСapacity = bodyСapacity;
    }

    public double getBodyСapacity() {
        return bodyСapacity;
    }

    public void setBodyСapacity(double bodyСapacity) {
        this.bodyСapacity = bodyСapacity;
    }
    public void changeBodyСapacity(double bodyСapacity1) {
        bodyСapacity1 = bodyСapacity + 6;
    }

    @Override
    public String toString() {
        return "Body{" +
                "bodyСapacity=" + bodyСapacity +
                '}';
    }
}
