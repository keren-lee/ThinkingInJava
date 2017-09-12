package cn.com.tyung.exam_3;

public class BandPass extends Filter {
	double lowCutoff,highCutoff;
	
	public BandPass(double lowCutoff,double highCutoff) {
		this.highCutoff = highCutoff;
		this.lowCutoff = lowCutoff;
	}
	
	public Wavefrom process(Wavefrom input) {
		return input;
	}
}
