package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String baseUrl = "http://demo.guru99.com/test/guru99home/";
		driver.get(baseUrl);
//		int totalbefore=driver.findElements(By.xpath("html/body/a/img")).size();
//		System.out.println("total images before switch " + totalbefore);
//		driver.switchTo().frame("a077aa5e"); //switching the frame by ID
//		int total = driver.findElements(By.xpath("html/body/a/img")).size();
//		System.out.println("total images after switch " + total);
		
		int sizeOfIframe = driver.findElements(By.tagName("iframe")).size();
		System.out.println(sizeOfIframe);
		
		for(int i = 0; i<sizeOfIframe; i++) {
		driver.switchTo().frame(i);
		System.out.println("index id" + i);
		int total = driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println("total images" +total);
		driver.switchTo().defaultContent();
		}
		
	}

}
