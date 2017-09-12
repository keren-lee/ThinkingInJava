package cn.com.tyung.exam_15;

public class WheatMill extends Mill {
	
	Grain process() {
		return new Wheat();
	}
}
