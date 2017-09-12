package cn.com.tyung.exam_5;

import java.util.Random;

public class RandomDoubles {
	
	private static Random ran = new Random();
	public double next() {
		return ran.nextDouble();
	}
}
