package week3.day4.homeassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAssign {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		//clicking image
		
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		
		//parent window
		String parentWindow = driver.getWindowHandle();
		
		//giving control to child window
		Set<String> openWindow = driver.getWindowHandles();
		System.out.println(openWindow.size());
		List<String> window=new ArrayList<String>(openWindow);
		driver.switchTo().window(window.get(1));
		System.out.println(driver.getTitle());
		WebElement text = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//td//a"));
		System.out.println(text.getText());
		text.click();
	//	driver.close();
		
		//back to parent window
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		
		//again to child window
		
				Set<String> openWindow2 = driver.getWindowHandles();
				System.out.println(openWindow2.size());
				List<String> window2=new ArrayList<String>(openWindow2);
				driver.switchTo().window(window2.get(1));
				System.out.println(driver.getTitle());
				WebElement text2 = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//tr)[3]//a"));
				System.out.println(text2.getText());
				text2.click();

				
				//back to parent window
				driver.switchTo().window(parentWindow);
				driver.findElement(By.linkText("Merge")).click();
				
				//alert handling
				Alert alertHandle = driver.switchTo().alert();
				alertHandle.accept();
				Thread.sleep(3000);
				
				System.out.println(driver.getTitle());
				
				
	}

}
