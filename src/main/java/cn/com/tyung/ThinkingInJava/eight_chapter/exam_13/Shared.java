package cn.com.tyung.ThinkingInJava.eight_chapter.exam_13;

public class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	
	public Shared() {
		System.out.println("creating "+this);
	}
	
	public void addRef() {
		refcount++;
	}
	
	public void dispose() {
		if(--refcount==0) {
			System.out.println("dispose "+this);
		}
	}
	
	public String toString() {return "Shared "+id;}
	
}
