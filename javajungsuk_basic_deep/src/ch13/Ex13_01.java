package ch13;

public class Ex13_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx1_1 t1= new ThreadEx1_1();
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);  // 생성자 Thread(Runnable target)
		
		t1.start();
		t2.start();
		
	}

}


class ThreadEx1_1 extends Thread {
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName());
			// 조상인 Thread의 getName()을 호출한다.
		}
	}
}

class ThreadEx1_2 implements Runnable {
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
			// 현재 실행 중인 Thread를 반환한다.
		}
	}
}