package week1.day4.homeaaignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		//to find if button is enabled
		Boolean isEnabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		if(isEnabled==false) {
			System.out.println("The button is disabled");
				}
		else {
		System.out.println("The button is not disabled");
		}
		
		//to find the position of a button
		 WebElement findElement = driver.findElement(By.id("j_idt88:j_idt94"));
		 Point location = findElement.getLocation();
		 System.out.println("x,Y-cordinates:"+location);
		 
		 //to find the background colour of button
		 String colour = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");
		 System.out.println("The background colour of the button:"+colour);
		 
		 //String colour1 = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("color");
		 //System.out.println("The background colour of the button:"+colour1);
		 
		 //to find the height and width of button
		 WebElement submitButton = driver.findElement(By.id("j_idt88:j_idt98"));
		 Dimension size = submitButton.getSize();
		 System.out.println("Width of box:"+size.width);
		 System.out.println("Height of box:"+size.height);
		 
		 //to verify the title of the page
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		String title = driver.getTitle();
		System.out.println("The title of the page is"+title);
		
		if(title.equals(title)) {
			System.out.println("The title of  the page is correct");
		}
		else {
			System.out.println("The title of the page is not correct");
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}
