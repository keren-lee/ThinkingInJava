package cn.com.tyung.ThinkingInJava.night_chapter.exam_2;

public class Processor {
	
	public String name() {
		return getClass().getSimpleName();
	}
	
	Object process(Object input) {
		return input;
	}
}
