package cn.com.tyung.exam_9;

public class X implements A, B {

	@Override
	public void b() {
		System.out.println("x b");
	}

	@Override
	public void a() {
		System.out.println("x a");
	}

}
