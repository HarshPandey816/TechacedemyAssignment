package AssignmentDay6;

class PassByValueDemo {
	static void changeValue(int num) {
        num = num + 10;
        System.out.println("Inside method: " + num);
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println("Before method call: " + a);

        changeValue(a);

        System.out.println("After method call: " + a);
    }
}
