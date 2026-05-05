package AssignmentDay6;

class checkDigit {
	public static void main(String[] args) {
        char ch = '5';

        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is not a digit");
        }
    }

}
