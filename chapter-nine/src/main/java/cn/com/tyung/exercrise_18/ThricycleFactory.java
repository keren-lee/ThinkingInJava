package cn.com.tyung.exercrise_18;

public class ThricycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		
		return new Thricycle();
	}

}
