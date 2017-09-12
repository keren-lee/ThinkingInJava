package cn.com.tyung.exam_2;

public class Processor {
	
	public String name() {
		return getClass().getSimpleName();
	}
	
	Object process(Object input) {
		return input;
	}
}
