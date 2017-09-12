package cn.com.tyung.exam_2;

public class Upcase extends Processor {
	
	String process(Object input) {
		return ((String)input).toUpperCase();
	}
}
