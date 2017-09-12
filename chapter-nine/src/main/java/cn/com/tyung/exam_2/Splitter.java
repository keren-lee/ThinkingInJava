package cn.com.tyung.exam_2;

import java.util.Arrays;

public class Splitter extends Processor {
	
	String process(Object input) {
		
		return Arrays.toString(((String)input).split(" "));
	}
}
