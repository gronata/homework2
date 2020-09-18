package homework4;

public class Triangle implements Shape {
    private double h;
    private double a;

    public Triangle() {

    }

    public Triangle(double h, double a) {
        this.h = h;
        this.a = a;
    }

    @Override
   public double square() {
        double sq = 0.5*h*a;
        return sq;
    }
}
