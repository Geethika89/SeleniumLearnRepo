package week2.day1.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Login page
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//My home page
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Create Lead page
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Geeth");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("G");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Gokul");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Automation Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@def.com");
		
		//dropdown selection using visisble text
		WebElement findElement = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select state=new Select(findElement);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		
		driver.navigate().refresh();
		//to clear the description field
		WebElement updatedescription = driver.findElement(By.id("updateLeadForm_description"));
		updatedescription.clear();
		
		//to update important note field
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("updated the field");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		//to retrieve title of page
		String title = driver.getTitle();
		System.out.println("The title of the page is:"+title);
	}

}
