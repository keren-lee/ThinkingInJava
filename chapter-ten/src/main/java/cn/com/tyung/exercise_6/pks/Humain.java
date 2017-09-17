package cn.com.tyung.exercise_6.pks;

import cn.com.tyung.exercise_6.pkf.Person;

public class Humain {
	
	protected class BlackPerson implements Person {
		
		public BlackPerson() {}
		
		@Override
		public void skinColor() {
			System.out.println("black skin");
		}
		
	}
}
