package week2.day3;

public class EdgeC extends ChromeC {
	
	public void takeSnap() {
		System.out.println("Take Snap");
	}

	public void clearCookies() {
		System.out.println("Clear cookies");
	}
	public static void main(String[] args) {
		
		EdgeC e=new EdgeC();
		e.takeSnap();
		e.clearCookies();
		e.browserName2();
		e.browserVersion();
		e.openUrlEdge();
		}

}
