package ch06;

public class Ex06_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data_1 d1 = new Data_1();
		// Data_2 d2 = new Data_2(); // compile error 발생
	}

}

class Data_1 {
	int value;
}

class Data_2 {
	int value;
	
	Data_2(int x){  // 매개변수가 있는 생성자
		value = x;
	}
}