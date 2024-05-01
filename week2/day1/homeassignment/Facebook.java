package week2.day1.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		//Lauch url in chrome
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		//Click create new button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Signup page
		driver.findElement(By.name("firstname")).sendKeys("Geeth");
		driver.findElement(By.name("lastname")).sendKeys("G");
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Geeth@123");
		
		
			//Day Dropdown
		WebElement dd1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select dayDd= new Select(dd1);
	    dayDd.selectByVisibleText("27");
		
		//month dropdown
		WebElement dd2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select monDd= new Select(dd2);
		monDd.selectByVisibleText("Oct");
		
		//year dropdown
		WebElement dd3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select yyDd= new Select(dd3);
		yyDd.selectByValue("1989");
		
		//radio button
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input")).click();

	}

}
