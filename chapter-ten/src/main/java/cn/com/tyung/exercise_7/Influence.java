package cn.com.tyung.exercise_7;

public class Influence {
	
	private int i = 0;
	
	void resertValue() {
		this.i = 0;
		System.out.println(i);
	}
	
	class InfluenceInner {
		
		void changeValue(Integer value) {
			System.out.println(i);
			i = value;
			System.out.println(i);
			resertValue();
		}
	} 
}
