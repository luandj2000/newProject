package newPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Feb24Lesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demo.guru99.com/test/radio.html";
		driver.get(baseUrl);
		
		//Get element
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		
		// Select radio1
		radio1.click();
		
		//Select radio2
		radio2.click();
		
		//toggle back
		radio1.click();
		
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		
		// check option 1
		option1.click();
		
		if(option1.isSelected()) {
		
			System.out.println("Check box is toggled on");
			
			
		}else {
			System.out.println("Check box is toggled off.");
		}
		
		driver.close();
	}

}
