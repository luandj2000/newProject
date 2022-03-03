package newPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demo.guru99.com/test/delete_customer.php";
		driver.get(baseUrl);
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement wait1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cusid")));
		driver.findElement(By.name("cusid")).sendKeys("3423453");
		driver.findElement(By.name("submit")).submit();
		
		// switch to the alert
		Alert alert = driver.switchTo().alert();
		
		// Capturing alert message
		String alertMessage = driver.switchTo().alert().getText();
		
		// Display message on console
		System.out.println(alertMessage);
		//Thread.sleep(500);
		
		// accept the alert
		alert.accept();
		
		driver.findElement(By.name("cusid")).sendKeys("456436");
		driver.findElement(By.name("submit")).submit();
		alert.accept();
		//driver.close();
	}

}
