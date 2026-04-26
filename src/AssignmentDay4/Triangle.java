package AssignmentDay4;

public class Triangle implements Polygon {
    int base, height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}