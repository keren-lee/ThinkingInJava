package cn.com.tyung.exam_9;

public class Y implements A {

	@Override
	public void a() {
		System.out.println("Y a");
	}
	
	B makeB() {
		return new B() {
			
			@Override
			public void b() {
				System.out.println("Y b");
			}
		};
	}
}
