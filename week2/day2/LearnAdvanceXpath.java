package week2.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAdvanceXpath {

	public static void main(String[] args) {
		//Learn Axes Xpath
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("www.salesforce.com");
	//	1.Parent to child


	//	Basic xpath/tagname of child


		//div[@class='nav-search-field ']/input




	//	2.Grandparent to GrandChild


	//	Basic xpath Gp//tagname Gc


	//	(//div[@class='searchbox']//input)[2]
		//div[@class='nav-fill']//input



//		3.child to Parent


	//	basic xpath child/parent::tagname parent 


		//input[@id='twotabsearchtextbox']/parent::div


	//	4.GrandChild to Grandparent


	//	basic xpath Gc/ancestor::tagname Gp


		//input[@name='q']/ancestor::div[@class='searchbox']


		//input[contains(@class,'input__field-2')]/ancestor::div[@class='searchbox']

	}

}
