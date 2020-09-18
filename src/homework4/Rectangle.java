package homework4;

public class Rectangle implements Shape {
    private double b;
    private double a;

    public Rectangle() {
    }

    public Rectangle(double b, double a) {
        this.b = b;
        this.a = a;
    }

    @Override
    public double square() {
        double sq = a*b;
        return sq;
    }
}
