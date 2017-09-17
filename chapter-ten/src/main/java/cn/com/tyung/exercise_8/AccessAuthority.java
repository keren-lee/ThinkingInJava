package cn.com.tyung.exercise_8;

public class AccessAuthority {
	
	private int getInnerElement() {
		AccessAuthority a = new AccessAuthority();
		Inner i = a.new Inner(0);
		return i.i;
	}
	
	class Inner {
		private int i;
		
		public String s;
		
		Inner(int i) {
			this.i = i;
		}
	}
	
}
