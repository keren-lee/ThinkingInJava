package cn.com.tyung.ThinkingInJava.eight_chapter.exam_15;

public class WheatMill extends Mill {
	
	Grain process() {
		return new Wheat();
	}
}
