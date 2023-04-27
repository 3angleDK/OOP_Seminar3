package Classes;

public class Triangle extends Polygon{
    public Triangle(double a, double b, double c){
        super(new double[] {a, b, c});
    }
    public Triangle(double[] sides){
        super(sides);
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public boolean isCorrect() {
        return super.isCorrect() &&
                (sides[0] < (sides[1] + sides[2]) &&
                 sides[1] < (sides[0] + sides[2]) &&
                 sides[2] < (sides[1] + sides[0]));
    }

    @Override
    public double getArea() {
        double p = getPerimiter() / 2.0;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

    @Override
    public String toString() {
        return getName() + String.format(" with sides: %1.1f, %1.1f, %1.1f.", sides[0], sides[1], sides[2]);
    }
}
