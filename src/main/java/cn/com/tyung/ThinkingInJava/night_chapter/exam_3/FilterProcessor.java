package cn.com.tyung.ThinkingInJava.night_chapter.exam_3;

public class FilterProcessor {
	
	public static void main(String[] args) {
		Wavefrom w = new Wavefrom();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(1.0, 2.0)), w);
	}
}
