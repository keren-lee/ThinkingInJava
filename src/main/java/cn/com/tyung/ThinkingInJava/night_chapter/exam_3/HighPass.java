package cn.com.tyung.ThinkingInJava.night_chapter.exam_3;

public class HighPass extends Filter {
	double cutoff;
	
	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}
	
	public Wavefrom process(Wavefrom input) {
		return input;
	}
}
