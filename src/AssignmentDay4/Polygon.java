package AssignmentDay4;

public interface Polygon {
	
	double getArea();

    default double getPerimeter(int... sides) {
        int sum = 0;
        for (int side : sides) {
            sum += side;
        }
        return sum;
    }

    static String shapeInfo() {
        return "Polygon is a 2D shape with multiple sides.";
    }

}
