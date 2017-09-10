package cn.com.tyung.ThinkingInJava.night_chapter.exam_5;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomWords implements Readable {
	
	private static Random ran = new Random();
	private static final char[] capitals = "QWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();
	private static final char[] lowers = "qwertyuiopasdfghjklzxcvbnm".toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	
	private int count;
	
	public RandomWords(int count) {
		this.count = count;
	}
	
	@Override
	public int read(CharBuffer cb) throws IOException {
		if(count-- == 0) {
			return -1;
		}
		cb.append(capitals[ran.nextInt(capitals.length)]);
		for(int i=0; i<4; i++) {
			cb.append(vowels[ran.nextInt(vowels.length)]);
			cb.append(lowers[ran.nextInt(lowers.length)]);
		}
		cb.append(" ");
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(new RandomWords(10));
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
	}
}
