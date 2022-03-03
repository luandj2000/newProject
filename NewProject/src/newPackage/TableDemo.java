package newPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		displayed in structured form using rows and columns
//		 <table> html tag
//		 <th> header
//		 <tr> table row
//		 <td> columns
//	
//		 <table>
//		 <tr>
//		 <th>First Name</th>
//		 <th>Last Name</th>
//		 <th>Age</th>
//		 </tr>
//		 <tr>
//		 <td>Jill</td>
//		 <td>Ann</td>
//		 <td>24</td>
//		 </tr>
//		 <tr>
//		 <td>Eve</td>
//		 <td>Anderson</td>
//		 <td>34</td>
//		 </tr>
//		 </table>

		/*
		* First Name Last Name Age
		* Jill Ann 24
		* Eve Anderson 34
		*/

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demo.guru99.com/test/web-table-element.php";
		driver.get(baseUrl);
		
		//No.of Columns - !!! starts at 1 and not 0.
		String col11 = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/thead/tr[1]/th[1]")).getText();
		System.out.println(col11);
		List <WebElement> col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("No of cols are : " +col.size());
		//No.of rows
		List <WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("No of rows are : " + rows.size());
		String col12 = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[4]/td[1]")).getText();
		System.out.println(col12);
		
		driver.get("https://demo.guru99.com/test/table.html");
		WebElement myTable = driver.findElement(By.xpath("/html/body/table/tbody"));
		List <WebElement> rows_table = myTable.findElements(By.tagName("tr"));
		// to calculate the no of rows in the table
		int row_count = rows_table.size();
		// Loop will execute till the last
		for (int row = 0;row<row_count;row++) {
		List <WebElement> columns_row = rows_table.get(row).findElements(By.tagName("td"));
		// to calculate no of columns in the spesific row
		int columns_count = columns_row.size();
		System.out.println("Number of columns in row " + row+ " are "+ columns_count);
		// Loop will execute till the last cell of that spesific row.
		for(int column = 0;column < columns_count;column++) {
			// to retrive the text from that spesific cell
			String celtext = columns_row.get(column).getText();
			System.out.println("Cell Value of row number " + row + " and column num " + column + " is " + celtext);
		}
		
		}
		
		//driver.close();
		
		
		
	}

}
