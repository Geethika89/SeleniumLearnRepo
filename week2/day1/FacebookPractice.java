package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPractice {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		user.sendKeys("testleaf.2023@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tuna@321");
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Find your account and log in.']")).click();
		
		String title = driver.getTitle();
		if(title.contains("Can't log in")) {
			System.out.println("The title of the page is correct");
		}
		
		else {
			System.out.println("The title of page is not correct");
		}

		Thread.sleep(3000);
		driver.close();
	}

}
