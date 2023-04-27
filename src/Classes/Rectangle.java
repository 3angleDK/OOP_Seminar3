package Classes;

public class Rectangle extends Polygon{
    public Rectangle(double a, double b){
        super(new double[] {a, b, a, b});
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
    @Override
    public double getArea() {
        double p = getPerimiter() / 2.0;
        return sides[0] * sides[1];
    }

    @Override
    public String toString() {
        return getName() + String.format(" with sides: %1.1f, %1.1f.", sides[0], sides[1]);
    }
}
