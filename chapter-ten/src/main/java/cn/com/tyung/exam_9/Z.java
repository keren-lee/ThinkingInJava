package cn.com.tyung.exam_9;

public class Z extends D {
	
	E makeE() {
		return new E() {
			
			@Override
			void e() {
				System.out.println("Z e()");
			}
		};
	}
}
