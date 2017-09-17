package cn.com.tyung.exam_5;

public class FinalParameter {
	
	public Destination destination(String dest) {
		return new Destination() {
			private String label = dest;
			@Override
			public String readLabel() {
				return label;
			}
		};
	}
	
}
