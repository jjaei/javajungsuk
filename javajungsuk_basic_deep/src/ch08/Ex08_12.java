package ch08;

public class Ex08_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			method1();
		} catch(Exception e) {
			System.out.println("main 메서드에서 예외가 처리되었습니다.");
	}

}

	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1 메서드에서 예외가 처리되었습니다.");
			throw e;
		}
	}
}