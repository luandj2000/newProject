package newPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demo.guru99.com/test/login.html";
		driver.get(baseUrl);
		
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("fakeMail@fake.com");
		driver.findElement(By.id("passwd")).sendKeys("verySecure");
		driver.findElement(By.id("SubmitLogin")).click();
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		
		driver.close();
		
	}

}
