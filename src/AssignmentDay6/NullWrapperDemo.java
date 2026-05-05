package AssignmentDay6;

class NullWrapperDemo {
	 public static void main(String[] args) {

	        String str = null;

	        Integer num = (str == null) ? null : Integer.valueOf(str);

	        System.out.println("Wrapper value: " + num);

	        // Safe usage
	        if (num == null) {
	            System.out.println("Value is null, cannot convert");
	        }
	    }

}
