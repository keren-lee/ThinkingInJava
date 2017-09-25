package cn.com.tyung.exam_9;

public class MultiInterfaces {
	static void takesA(A a) {
		a.a();
	}
	
	static void takesB(B b) {
		b.b();
	}
	
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		takesA(x);
		takesA(y);
		takesB(x);
		takesB(y.makeB());
	}
}
