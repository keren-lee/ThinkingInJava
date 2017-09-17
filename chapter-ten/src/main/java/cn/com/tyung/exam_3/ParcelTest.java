package cn.com.tyung.exam_3;

public class ParcelTest {
	
	public static void main(String[] args) {
		Parcel p = new Parcel();
		Contents c = p.contents();
		Destination d = p.destination("Destination");
	}
}
