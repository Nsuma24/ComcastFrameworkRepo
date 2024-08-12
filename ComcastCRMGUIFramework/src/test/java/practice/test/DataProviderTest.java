package practice.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "getData")
	public void executeTest(String Brand, String productName)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		// Search product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Brand , Keys.ENTER);
		
		String x = "(//span[text()='"+productName+"'])/../../../../div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a/span/span[2]/span[2]";
 		
		String price = driver.findElement(By.xpath(x)).getText();
		System.out.println(price);
	}
	
	@DataProvider
	public Object[][] getData() throws Throwable
	{
	FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\Dataprovider.xlsx");
	Workbook wb = WorkbookFactory.create(fi);
	Sheet sh = wb.getSheet("products");
	int rowCount = sh.getLastRowNum()+1;
	int celCount =	sh.getRow(0).getLastCellNum();
	System.out.println(rowCount);
	System.out.println(celCount);
	
		Object[][] obj = new Object[rowCount][celCount];
		for (int i = 1; i <rowCount; i++) 
		{
			for (int j = 0; j <celCount; j++) 
			{
			obj[i][j] =	sh.getRow(i).getCell(j).getStringCellValue();
			}
		}

		return obj;
	}


}










