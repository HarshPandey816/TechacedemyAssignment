package AssignmentDay6;

class Box {
    int length;

    Box(int length) {
        this.length = length;
    }
}


class BoxDemo {
	static void modifyBox(Box b) {
        b.length = 50;
    }

    public static void main(String[] args) {
        Box box = new Box(10);

        System.out.println("Before: " + box.length);

        modifyBox(box);

        System.out.println("After: " + box.length);
    }

}
