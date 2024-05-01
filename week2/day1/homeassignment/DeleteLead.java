package week2.day1.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {   //Incomplete with doubt//

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543211");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//String firstId = driver.findElement(By.xpath("//a[@id='ext-gen1101']")).getText();
		//String firstId = driver.findElement(By.className("x-grid3-cell-inner x-grid3-col-partyId")).getText();
		
		//Parent to child
		String firstId = driver.findElement(By.xpath("//td[contains(@class,'grid3-cell-first ')]//a")).getText();
		System.out.println("The first Id of listed data is:"+firstId);
		
		//driver.close();

	}

}
