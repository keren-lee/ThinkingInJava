package cn.com.tyung.exam_12;

public class Characteristic {
	private String s;
	
	Characteristic(String s) {
		this.s=s;
		System.out.println("Creating Characteritic "+s);
	}
	
	protected void dispose() {
		System.out.println("Dispost Characteritic "+s);
	}
}
