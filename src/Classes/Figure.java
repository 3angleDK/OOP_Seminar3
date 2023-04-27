package Classes;

public abstract class Figure {
    public abstract String getName();
    public abstract double getPerimiter();
    public abstract double getArea();
    public boolean isCorrect(){
        return true;
    }
    public String getInfo(){
        return toString() + String.format("\n\t have perimeter: %1.3f and area: %1.3f.", getPerimiter(), getArea());
    }
}
