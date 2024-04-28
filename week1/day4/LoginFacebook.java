package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		String title = driver.getTitle();
		System.out.println(title);
		//System.out.println(driver.getTitle());
		
		if(title.equalsIgnoreCase("Forgot password | Can't log in | Facebook")){
			System.out.println("Titile verified");
		}
		
		
		
		Thread.sleep(5000);
		driver.close();
		//to verify title
		//full title,we use equals
		//partial tile verification, we can use contain
		

	}

}
