package homework4;

public class Circle implements Shape {
    private double  r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double square() {
    double sq = r*r*3.14;
     return sq;
    }
}
