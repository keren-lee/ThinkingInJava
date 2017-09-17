package cn.com.tyung.exercise_5;

public class InnerInstance {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner oi = outer.new Inner();
	}
	
}
