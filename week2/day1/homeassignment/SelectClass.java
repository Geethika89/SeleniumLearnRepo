package week2.day1.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Geeth");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("G");
		//dropdown with index
		WebElement dd1 = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select sourceDp = new Select(dd1);
		sourceDp.selectByIndex(4);
		
		//dropdown with visibletext
		WebElement dd2 = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		Select marketDd=new Select(dd2);
		marketDd.selectByVisibleText("Automobile");
		
		//dropdown with value
		WebElement dd3 = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select ownerDd=new Select(dd3);
		ownerDd.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		if(title.contains("View Lead")) {
			System.out.println("The title of the page is same as in the DOM");
		}
		
		else {
			System.out.println("The title of the page is not the same as in the DOM");
		}
		
		driver.close();
		}

}
