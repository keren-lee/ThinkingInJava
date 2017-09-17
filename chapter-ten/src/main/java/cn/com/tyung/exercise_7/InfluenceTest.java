package cn.com.tyung.exercise_7;

import cn.com.tyung.exercise_7.Influence.InfluenceInner;

public class InfluenceTest {
	
	public static void main(String[] args) {
		Influence i = new Influence();
		InfluenceInner ii = i.new InfluenceInner();
		ii.changeValue(10);
	}
	
}
