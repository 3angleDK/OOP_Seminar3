package Classes;

public class Circle extends Figure{
    private double radius;
    public Circle(double r){
        this.radius = r;
    }

    @Override
    public boolean isCorrect() {
        return super.isCorrect() && this.radius > 0.0;
    }

    @Override
    public String getName() {
        return "Circle";
    }
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimiter() {
        return 2.0 * Math.PI * this.radius;
    }
    @Override
    public String toString() {
        return getName() + String.format(" with radius: %1.1f.", this.radius);
    }

}
