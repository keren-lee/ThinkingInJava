package cn.com.tyung.exam_6;

public class NestingInterfaces {
	
	public class Bimp implements A.B {
		public void f() {
		}
	}
	
	class Cimpl implements A.C {
		public void f() {
		}
	}
	//私有的嵌套接口，不可以被实现
//	class Dimpl implements A.D {
//		void f();
//	}
	
//	class Dimpl2 extends A.Dimpl2 {
//		void f();
//	}
	
	class Eimpl implements E {
		public void g() {
		}
	}
	
	class EGimpl implements E.G {
		public void f() {
		}
	}
	//嵌套接口内还可以嵌套实现嵌套的接口
	class Eimpl2 implements E {
		public void g() {
		}
		
		class EG implements E.G {
			public void f() {
			}
		}
	}

	public void g() {
	}
	
	public static void main(String[] args) {
		A a = new A();
		//D为私有，不可以直接访问
//		A.D ad = a.getD();
		//只可以返回A.D类型,但是A.D为私有，不可以直接访问
//		A.Dimpl2 adi = a.getD();
		//私有嵌套接口的方法不可以直接访问
//		a.getD().f();
		A a2 = new A();
		//只有间接通过具有访问权限的A.D才能去调用其内部的方法。
		a2.receiveD(a2.getD());
	}
}
