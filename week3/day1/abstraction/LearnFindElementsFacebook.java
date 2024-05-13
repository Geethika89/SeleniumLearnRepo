package week3.day1.abstraction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElementsFacebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		int size = list.size();
		System.out.println("total number of elemts in dom with tag a :" +size);
		for (WebElement web : list) {
			String text1 = web.getText();
			System.out.println("printing text : "+text1);
		}
	}

}
