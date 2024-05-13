package week3.day1.homeassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterfaceAjio {


	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class=\"facet-linkhead\"]/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Men - Fashion Bags']/following-sibling::label[1]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@class='length']/strong[1]")).getText();
		System.out.println(text);
		
		//to print list of brands
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class=\"brand\"]/strong"));
		System.out.println("The size of list :" +brands.size());
		for (WebElement e : brands) {
			String brandList = e.getText();
			System.out.println("The brand List is: "+brandList);
		}
		
		//to print list of bag names
		List<WebElement> name = driver.findElements(By.xpath("//div[@class=\"nameCls\"]"));
		System.out.println("The total size of number of bags:"+name.size());
		for (WebElement nameList : name) {
			 String totNames = nameList.getText();
			 System.out.println("The total number of names in list: "+totNames);
		}
	}

}

