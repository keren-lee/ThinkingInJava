package cn.com.tyung.exercrise_18;

public class CycleTestDemo {
	
	public static void rideCycle(CycleFactory factory) {
		Cycle cycle = factory.getCycle();
		cycle.ride();
	}
	
	public static void main(String[] args) {
		rideCycle(new UnicycleFactory());
		rideCycle(new BicycleFactory());
		rideCycle(new ThricycleFactory());
	}
}
