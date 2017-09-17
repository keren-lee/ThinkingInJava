package cn.com.tyung.exam_2;

public class Parcle {
	
	class Contents {
		private int i = 11;
		
		public int value() {
			return i;
		}
	}
	
	class Destination {
		private String label;
		
		Destination(String whereTo) {
			this.label = whereTo;
		}
		
		String readLabel() {
			return label;
		}
	}
	
	public static void main(String[] args) {
		Parcle p = new Parcle();
		Parcle.Contents pc = p.new Contents();
		Parcle.Destination pd = p.new Destination("whereTo");
	}
}
