package cn.com.tyung.exam_7;

public class Parcle {
	
	public static class PContents implements Contents {
		private int i = 11;
		@Override
		public int value() {
			
			return i;
		}
		
	}
	
	protected static class PDestination implements Destination {
		private String label;
//		private static String test = "Test";
		private PDestination(String label) {
			this.label = label;
		}
		
		@Override
		public String readLabel() {
			
			return label;
		}
		
	}
	
	public static void f() {}
	static int x = 10;
	static class AnotherLevel {
		public static void f() {}
		static int x = 10;
	}
	
	public static Destination destination(String s) {
		
		return new PDestination(s);
	}
	
	public static Contents contents() {
		return new PContents();
	}
	
	public static void main(String[] args) {
		Contents c = contents();
		Destination d = destination("Destination");
	}
}
