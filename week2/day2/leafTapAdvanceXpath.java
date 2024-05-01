package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafTapAdvanceXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Grandparent to Grandchild
		driver.findElement(By.xpath("//form[@id='login']//input")).sendKeys("demosalesmanager");
		
		//Grandparent to grandchild
		driver.findElement(By.xpath("//form[@id='login']//input[@id='password']")).sendKeys("crmsfa");
		
		//Child to Parent
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']/parent::p")).click();
		
		//parent to child
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		
		//Grandchild to GrandParent
		driver.findElement(By.xpath("//a[text()='Leads']/ancestor::div[@class='x-panel-tc']")).click();

	}

}
