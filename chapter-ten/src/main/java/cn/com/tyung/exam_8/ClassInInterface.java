package cn.com.tyung.exam_8;

public interface ClassInInterface {
	void howBody();
	
	class Test implements ClassInInterface {

		@Override
		public void howBody() {
			System.out.println("ClassInInterface");
		}
		
		public static void main(String[] args) {
			new Test().howBody();
		}
	}
}
