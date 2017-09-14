package cn.com.tyung.exercrise_18;

public class UnicycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		
		return new Unicycle();
	}

}
