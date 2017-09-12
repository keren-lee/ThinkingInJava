package cn.com.tyung.exam_3;

public class Wavefrom {
	
	private static long counter;
	private long id = counter++;
	
	public String toString() {
		return "Wavefrom"+id;
	}
}
