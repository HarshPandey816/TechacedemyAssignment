package AssignmentDay4;

public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        if (topLeft.xSpeed != bottomRight.xSpeed || topLeft.ySpeed != bottomRight.ySpeed) {
            throw new IllegalArgumentException("Both points must have same speed!");
        }
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString() {
        return "Rectangle TopLeft: " + topLeft + " BottomRight: " + bottomRight;
    }

}
