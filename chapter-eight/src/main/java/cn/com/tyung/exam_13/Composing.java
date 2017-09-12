package cn.com.tyung.exam_13;

public class Composing {
	
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	public Composing(Shared shared) {
		System.out.println("creating "+this);
		this.shared = shared;
		shared.addRef();
	}
	
	protected void dispose() {
		System.out.println("dispose "+this);
		shared.dispose();
	}
	
	public String toString() {return "Composing "+id;}
}
