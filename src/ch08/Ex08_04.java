package ch08;

public class Ex08_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
			} else {
				System.out.println("ArithmeticException");
			}
		} catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
	}

}
