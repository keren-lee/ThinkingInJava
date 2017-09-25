package cn.com.tyung.exercise_22;

public class Sequence {
	private Object[] items;
	private int next = 0;
	
	public Sequence(int size) {
		items = new Object[size];
	}
	
	public void add(Object x) {
		if(next<items.length) {
			items[next++] = x;
		}
	}
	
	private class SequenceSelector implements Selector {
		private int i = 0;
		@Override
		public boolean end() {
			return i == items.length;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if(i<items.length) {
				i++;
			}
		}
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}
	
	public Selector reserveSelector() {
		return new ReserveSelector();
	}
	
	private class ReserveSelector implements Selector {
		private int i;
		
		ReserveSelector() {
			this.i = items.length-1;
		}
		
		@Override
		public boolean end() {
			return i == -1;
		}

		@Override
		public Object current() {
			
			return items[i];
		}

		@Override
		public void next() {
			if(i>=0) {
				i--;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i=0; i<10; i++) {
			sequence.add(Integer.toString(i));
		}
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.println(selector.current()+" ");
			selector.next();
		}
		
		Selector reserveSelector = sequence.reserveSelector();
		while(!reserveSelector.end()) {
			System.out.println(reserveSelector.current());
			reserveSelector.next();
		}
	}
}
