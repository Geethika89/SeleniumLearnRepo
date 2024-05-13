package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnListSetAmazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.co.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys",Keys.ENTER);
		List<WebElement> elements = driver.findElements(By.className("a-price-whole"));
		int numberOfToys = elements.size();
		System.out.println(numberOfToys);
		List<Integer> listPrice=new ArrayList<Integer>();
		System.out.println("List of prices:");
		//to get the prices
		for (WebElement toys : elements) {
			String allPrice = toys.getText();
			
			System.out.println(allPrice);
			
			//now the price is to be converted from string to integer to get the min value
			String replacedPrice = allPrice.replace(",","");
			//System.out.println(replacedPrice);
			int parseIntPrice = Integer.parseInt(replacedPrice);
			//System.out.println(parseIntPrice);
			
			
			listPrice.add(parseIntPrice);
		}
		System.out.println("listPrice" +listPrice);
		
		
		
		
		
	//	Collections.sort(listPrice);
	//	Integer minVal = listPrice.get(0);
		//System.out.println("Minimum Value is"+minVal);
		
	//	Set<Integer> priceList=new TreeSet<Integer>(listPrice);
	//	System.out.println("The list of price with no duplicates: "+priceList+"\n"+priceList.size());
	}

}
