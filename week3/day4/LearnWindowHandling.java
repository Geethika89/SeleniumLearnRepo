package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandling {

	public static void main(String[] args) {
		
		//to avoid notifications
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in");
		
		//click flight
		driver.findElement(By.xpath("//li[@id='flight']//span[1]")).click();
		
		//parent window
		String parentWindow = driver.getWindowHandle();
		
		
		//Child window
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println("size:"+childWindow.size());
		
		List<String> window=new ArrayList<String>(childWindow);
		driver.switchTo().window(window.get(1));
		String childTitle = driver.getTitle();
		System.out.println("Titile of child window:"+childTitle);
		
		//return to parent window
		driver.switchTo().window(parentWindow);
		driver.close();
		
	
	}

}
