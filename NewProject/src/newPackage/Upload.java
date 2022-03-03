package newPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//
		
		String baseUrl = "https://www.monsterindia.com/seeker/registration";
		
		
		driver.manage().window().maximize(); // always write wait code after this
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);//for page load
		driver.get(baseUrl);// Testing webpage
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //for implicity wait
		
		// FILE UPLOADING USING SENDKEYS ....
		
		WebElement browse = driver.findElement(By.xpath("//input[@id = 'file-upload']"));
		//click on 'Choose file' to upload the desired file
		browse.sendKeys("C:\\JavaInspiredTesting\\upload test.txt"); //uploading the file using sendKeys
		System.out.println("File is Uploaded Successfully");
	}

}
