package cn.com.tyung.exam_9;

public class MultiImplementation {
	static void takesD(D d) {
		d.d();
	}
	
	static void takesE(E e) {
		e.e();
	}
	
	public static void main(String[] args) {
		Z z = new Z();
		takesD(z);
		takesE(z.makeE());
	}
}
