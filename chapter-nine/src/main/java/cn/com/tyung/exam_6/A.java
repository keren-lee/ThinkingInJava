package cn.com.tyung.exam_6;

public class A {
	
	interface B {
		void f();
	}
	
	public class Bimpl implements B {
		public void f() {
		}
	}
	
	private class Bimpl2 implements B {
		public void f() {
		}
	}
	
	public interface C {
		void f();
	}
	
	class Cimpl implements C {
		public void f() {
		}
	}
	
	private class Cimpl2 implements C {
		public void f() {
		}
	}
	
	private interface D {
		void f();
	}
	
	private class Dimpl implements D {
		public void f() {
		}
	}
	
	public class Dimpl2 implements D {
		public void f() {
		}
	}
	
	public D getD () {
		return new Dimpl2();
	}
	
	private D dRef;
	
	public void receiveD(D d) {
		this.dRef = d;
		dRef.f();
	}
	
}
