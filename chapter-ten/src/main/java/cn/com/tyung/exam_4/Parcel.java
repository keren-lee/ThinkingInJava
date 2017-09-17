package cn.com.tyung.exam_4;

public class Parcel {
	
	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;
			PDestination(String label) {
				this.label = label;
			}
			@Override
			public String readLabel() {
				return label;
			}
		}
		return new PDestination(s);
	}
	
	private void internalTracking(boolean b) {
		if(b) {
			class TrackingSlip {
				private String id;
				TrackingSlip(String id) {
					this.id = id;
				}
				String getSlip() {
					return id;
				}
			}
			TrackingSlip ts = new TrackingSlip("1234");
			String s = ts.getSlip();
		}
	}
	
	public void track() {
		internalTracking(true);
	}
	
	public static void main(String[] args) {
		//方法内的内部类
		Parcel p = new Parcel();
		Destination d = p.destination("Destination");
		System.out.println(d);
		
		//域内的内部类
		p.track();
	}
	
}
