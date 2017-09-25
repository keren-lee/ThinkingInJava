package cn.com.tyung.exam_8;

public class MNA {
	void f() {}
	class A {
		void g() {}
		
		class B {
			void h() {
				f();
				g();
			}
		}
	}
	
	public static void main(String[] args) {
		MNA mna = new MNA();
		MNA.A mnaa = mna.new A();
		MNA.A.B mnab = mnaa.new B();
		mnab.h();
	}
}
