package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demo.guru99.com/test/newtours/";
		String practiseUrl = "https://demoqa.com/automation-practice-form";
		//driver.get(baseUrl);
		
//		driver.get(practiseUrl);
//		driver.findElement(By.id("firstName"));
//		driver.findElement(By.name("gender"));
////		driver.findElement(By.className("practice-form-wrapper"));
//		driver.findElement(By.cssSelector("input[id = 'firstName']"));
//		driver.findElement(By.xpath("//input[@id=firstName]"));
//		driver.get(baseUrl);
////		driver.findElement(By.linkText("SUPPORT"));
////		driver.findElement(By.partialLinkText("SU"));
		
		
		
		driver.get(practiseUrl);
		
		WebElement firstName = driver.findElement(By.id("lastName"));
		boolean isDisplayedStatusOffFirstName = firstName.isDisplayed();
		boolean isEnabledStatusOffFirstName = firstName.isEnabled();
		System.out.println(isDisplayedStatusOffFirstName + " "+isEnabledStatusOffFirstName );
		
		driver.findElement(By.cssSelector("input[id = 'userEmail']"));
		driver.findElement(By.xpath("//input[@id='userEmail']"));
		
		driver.findElement(By.className("left-pannel"));
		driver.get(baseUrl);
		driver.findElement(By.partialLinkText("REG"));
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("Send keys");
		
		System.out.println("Did finish");
	
		
		driver.close();
	}

}
