package cn.com.tyung.exercise_6.pkt;

import cn.com.tyung.exercise_6.pkf.Person;
import cn.com.tyung.exercise_6.pks.Humain;

public class AfricPerson extends Humain {
	
	Person getBlackPerson(Humain humain) {
		
		return humain.new BlackPerson();
	}
	
}
