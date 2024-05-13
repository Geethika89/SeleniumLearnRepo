package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(3000);
		
		List<WebElement> listOfCountries = driver.findElements(By.xpath("//ul[contains(@class,'all ui-helper-reset')]//label"));
		System.out.println(listOfCountries.size());
		
		for(int i=0;i<listOfCountries.size();i++) {
			String countryName = listOfCountries.get(i).getText();
			System.out.println(countryName);
			
			driver.findElement(By.xpath("((//label[text()='"+countryName+"'])[2]/preceeding::div)[last()]")).click();
		}
		

	}

}
