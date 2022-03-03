package newPackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeworkPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demo.guru99.com/test/newtours/reservation.php";
		driver.get(baseUrl);
		
		driver.findElement(By.cssSelector("input[name = 'tripType'][value = 'oneway']")).click();;
		//driver.findElement(By.name("fromPort")).sendKeys("London");
		Select select = new Select(driver.findElement(By.name("fromPort")));
		select.selectByVisibleText("London");
		
		driver.findElement(By.cssSelector("input[name = 'servClass'][value = 'First']")).click();
		driver.findElement(By.name("findFlights")).click();
		
		driver.close();
	}

}
