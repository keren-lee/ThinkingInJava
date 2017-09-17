package cn.com.tyung.exam_5;

public class AnonymousConstructor {
	
	public static Base getBase(int i) {
		return new Base(i) {
			
			{
				System.out.println("Inside instance initializer");
			}
			
			@Override
			public void f() {
				System.out.println("In Anonymous f()");
			}
		};
	}
	
	public static void main(String[] args) {
		Base base = getBase(10);
		base.f();
	}
}
