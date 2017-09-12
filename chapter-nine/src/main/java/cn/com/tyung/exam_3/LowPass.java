package cn.com.tyung.exam_3;

public class LowPass extends Filter {
	
	double cutoff;
	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}
	
	public Wavefrom process(Wavefrom input) {
		return input;
	}
}
