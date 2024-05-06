package comsample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateWebTablesInSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa?");
		
		WebElement values = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[4]//td[4]"));
		System.out.println(values.getText());
		
		List<WebElement> allcol = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//th"));
		
//		int colsize = allCols.Size();
		System.out.println(allcol.size());
		for(int i= 1; i<=allcol.size(); i++) {
			System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]//th[" + i + "]")).getText() + " ");
		}
		System.out.println();
		
		List<WebElement> allrow = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td"));
		int rowsize = allrow.size();
		System.out.println("No of rows: "+ rowsize);
		
		for(int row=1; row<rowsize; row++) {
			for(int col=1; col<=allcol.size(); col++) {
				System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[" + row + "]//td[" + col +"]")).getText() + " ");
			}
		}

	}

}
