package AssignmentDay4;

public class Main1 {

	public static void main(String[] args) {
		
		MovablePoint p1 = new MovablePoint(0, 0, 2, 2);
        MovableCircle circle = new MovableCircle(5, p1);

        MovablePoint tl = new MovablePoint(0, 10, 1, 1);
        MovablePoint br = new MovablePoint(5, 5, 1, 1);
        MovableRectangle rect = new MovableRectangle(tl, br);

        System.out.println("Before Move:");
        System.out.println(circle);
        System.out.println(rect);

        circle.moveRight();
        circle.moveUp();

        rect.moveLeft();
        rect.moveDown();
        
        System.out.println("\nAfter Move:");
        System.out.println(circle);
        System.out.println(rect);
    }


}
