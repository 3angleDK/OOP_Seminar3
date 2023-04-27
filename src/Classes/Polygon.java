package Classes;

public abstract class Polygon extends Figure{
    protected double[] sides;
    public Polygon(double[] sides){
        this.sides = sides;
    }

    @Override
    public boolean isCorrect() {
        for (int i = 0; i < sides.length; i++)
            if (sides[i] <= 0.0) return false;
        return super.isCorrect();
    }

    @Override
    public double getPerimiter() {
        double result = 0.0;
        for (int i = 0; i < sides.length; i++) {
            result += sides[i];
        }
        return result;
    }
}
