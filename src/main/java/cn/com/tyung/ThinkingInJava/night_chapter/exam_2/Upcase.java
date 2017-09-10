package cn.com.tyung.ThinkingInJava.night_chapter.exam_2;

public class Upcase extends Processor {
	
	String process(Object input) {
		return ((String)input).toUpperCase();
	}
}
