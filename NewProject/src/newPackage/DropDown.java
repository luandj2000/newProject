package newPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demoqa.com/automation-practice-form";
		driver.get(baseUrl);
		// Validate is selected and clicked
		WebElement checkBoxSelected = driver.findElement(By.cssSelector("label [for='hobbies-checkbox-1'][class='custom-control-label']"));
		//Sometimes input etc. not working - use label etc next to it.
		//WebElement checkBoxSelected = driver.findElement(By.cssSelector("input[id='hobbies-checkbox-1']"));
		/*WebElement checkBoxSelected = driver.findElement(By.id("hobbies-checkbox-1"));
		boolean isSelected = checkBoxSelected.isSelected();
		
		if(isSelected == false) {
			checkBoxSelected.click();
		}*/
		// Validate isDisplayed and click	
		WebElement checkBoxDisplayed = driver.findElement(By.cssSelector("label [for='hobbies-checkbox-2]"));
		boolean isDisplayed = checkBoxDisplayed.isDisplayed();
		if(isDisplayed == true) {
			checkBoxDisplayed.click();
		}
		// validate isEnabled and click
		WebElement checkBoxEnabled = driver.findElement(By.cssSelector("label [for='hobbies-checkbox-3'"));
		boolean isEnabled = checkBoxEnabled.isEnabled();
		
		if(isEnabled ==true) {
			checkBoxEnabled.click();
		}
		
		
	}

}
