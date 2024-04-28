package week1.day4.homeaaignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//basic checkbox
		driver.findElement(By.id("j_idt87:j_idt89")).click();
		
		//notification checkbox
		driver.findElement(By.id("j_idt87:j_idt91")).click();
		//tristate checkbox
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		
		//toggle switch
		
		WebElement findElement = driver.findElement(By.id("j_idt87:j_idt100"));
		System.out.println("The text is:"+findElement.getText());
		findElement.click();
		
		boolean selected = driver.findElement(By.id("j_idt87:j_idt100")).isSelected();
		//System.out.println(selected);
		if(selected==false) {
			System.out.println("The toggle button is ON");
		}
		else {
			System.out.println("The toggle button is OFF");
		}
		
		
		
		
		
		//verify if checkbox is diabled
		boolean enabled = driver.findElement(By.id("j_idt87:j_idt100")).isEnabled();
		if(enabled==false) {
			System.out.println("The check box to verify is enabled");
		}
		else {
			System.out.println("The check box to verify is disabled");
		}
		
		//to click on th

	}

}
