package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Geeth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//select by index
		WebElement sourceDrop = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select dd1=new Select(sourceDrop);
		dd1.selectByIndex(5);
		//select bt value
		WebElement industryDrop = driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']"));
		Select dd2=new Select(industryDrop);
		dd2.selectByValue("IND_SOFTWARE");
		//select by visible text
		WebElement ownershipDrop = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select dd3=new Select(ownershipDrop);
		dd3.selectByVisibleText("Partnership");
		
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
;