package exercise;

// BEGIN
public class Circle {
    private final int radius;
    Point point;

    public Circle(Point point, int radius) {
        this.radius = radius;
        this.point = point;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw NegativeRadiusException.NEGATIVE_RADIUS_EXCEPTION;
        } else {
            return Math.PI * Math.pow(radius, 2);
        }
    }
}
// END
