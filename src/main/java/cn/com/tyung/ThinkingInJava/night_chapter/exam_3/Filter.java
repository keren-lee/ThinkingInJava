package cn.com.tyung.ThinkingInJava.night_chapter.exam_3;

public class Filter {
	
	public String name() {
		return getClass().getSimpleName();
	}
	
	public Wavefrom process(Wavefrom input) {
		return input;
	}
}
