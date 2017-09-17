package cn.com.tyung.exam_2;

public class DoNew {
	
	public class Inner {}
	
	public static void main(String[] args) {
		DoNew dn = new DoNew();
		DoNew.Inner di = dn.new Inner();
	}
}
