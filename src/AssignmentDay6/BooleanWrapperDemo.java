package AssignmentDay6;

class BooleanWrapperDemo {
	public static void main(String[] args) {

        Boolean b1 = Boolean.valueOf("true");
        Boolean b2 = Boolean.valueOf("false");

        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);

        System.out.println("Logical AND: " + (b1 && b2));
    }
}
