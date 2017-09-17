package cn.com.tyung.exercise_5;

public class Outer {
	
	Outer() {
		System.out.println("Outer()");
	}
	
	class Inner {
		Inner() {
			System.out.println("Inner()");
		}
	}
	
}
