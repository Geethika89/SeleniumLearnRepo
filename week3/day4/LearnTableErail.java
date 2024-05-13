package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTableErail {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.erail.in/");
		
		WebElement fromStatn = driver.findElement(By.id("txtStationFrom"));
		fromStatn.clear();
		fromStatn.sendKeys("MAS",Keys.ENTER);
		
		WebElement toStatn = driver.findElement(By.id("txtStationTo"));
		toStatn.clear();
		toStatn.sendKeys("MDU",Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> trainNumber = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[1]"));
		System.out.println(trainNumber.size());
		System.out.println("List of train Number : ");
		for (int i=0; i<trainNumber.size();i++) {
			String listTrainNum = trainNumber.get(i).getText();
			
			System.out.println(listTrainNum);
		}
	}

}
