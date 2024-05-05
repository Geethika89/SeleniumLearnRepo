package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserP {

	
	
	
		public void browserName1() {
			
		System.out.println("The browser name is chrome");

	}
		
		public void browserName2() {
			System.out.println("The browser name is edge");
		}
		
		public void browserVersion() {
			System.out.println("The browser version is 55.5");
		}
		
		public void openUrlEdge() {
			EdgeDriver driver=new EdgeDriver();
			driver.get("www.google.com");
		}
		
		public void closeBrower() {
			EdgeDriver driver1=new EdgeDriver();
			driver1.close();
		}
		
		public void openUrlChrome() {
			ChromeDriver driver=new ChromeDriver();
			driver.get("www.google.com");
		}
		
		public void navigateBack() {
			ChromeDriver driver=new ChromeDriver();
			driver.navigate().back();
		}
}
