package AssignmentDay4;

public class Rectangle implements Polygon {

	int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}
