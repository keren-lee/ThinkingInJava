package cn.com.tyung.exam_2;

public class DoThis {
	
	void f() {
		System.out.println("DoThis f()");
	}
	
	public class Inner {
		public DoThis outer() {
			return DoThis.this;
		}
	}
	
	public Inner inner() {
		return new Inner();
	}
	
	public static void main(String[] args) {
		DoThis dt = new DoThis();
		DoThis.Inner di = dt.inner();
		di.outer().f();
	}
	
}
