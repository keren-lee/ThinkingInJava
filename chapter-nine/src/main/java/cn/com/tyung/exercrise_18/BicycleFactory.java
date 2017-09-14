package cn.com.tyung.exercrise_18;

public class BicycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		
		return new Bicycle();
	}

}
