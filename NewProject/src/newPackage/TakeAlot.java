package newPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeAlot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.incredible.co.za";
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("search")).sendKeys("laptops");
		driver.findElement(By.id("search")).submit();
		//driver.findElement(By.className("button [class = 'action tocart primary'][tabindex = '0']")).click();
		//driver.findElement(By.linkText("Help")).click();
		
	}

}
