package week2.day3;

public class ChromeC extends BrowserP{
	
	
	public void openIncognito() {
		System.out.println("The Incognito is open");
	}
	
	public void clearCache() {
		System.out.println("The cache is cleared");
	}

	public static void main(String[] args) {
		
		ChromeC c=new ChromeC();
		c.browserName1();
		c.browserVersion();
		c.openIncognito();
		c.clearCache();
		c.openUrlChrome();
		
		
	}

}
