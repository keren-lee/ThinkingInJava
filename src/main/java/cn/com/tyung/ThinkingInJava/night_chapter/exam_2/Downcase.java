package cn.com.tyung.ThinkingInJava.night_chapter.exam_2;

public class Downcase extends Processor {
	
	String process(Object input) {
		return ((String)input).toLowerCase();
	}
}
