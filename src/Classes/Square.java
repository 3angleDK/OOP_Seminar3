package Classes;

public class Square extends Polygon{
    public Square(double a){
        super(new double[] {a, a, a, a});
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return sides[0] * sides[0];
    }

    @Override
    public String toString() {
        return getName() + String.format(" with side: %1.1f.", sides[0]);
    }
}
