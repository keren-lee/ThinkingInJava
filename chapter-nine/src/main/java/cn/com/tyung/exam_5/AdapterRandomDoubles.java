package cn.com.tyung.exam_5;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdapterRandomDoubles extends RandomDoubles implements Readable {
	
	private int count;
	
	public AdapterRandomDoubles(int count) {
		this.count = count;
	}
	
	public int read(CharBuffer cb) throws IOException {
		if(count-- == 0) {
			return -1;
		}
		String result = Double.toString(next())+" ";
		cb.append(result);
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(new AdapterRandomDoubles(10));
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
	}
}
