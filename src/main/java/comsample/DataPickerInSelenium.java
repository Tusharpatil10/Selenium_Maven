package comsample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPickerInSelenium {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tpatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/"); // to maintains the browser history that's the different between get, and get just takes you to the particular url who takes you to the particular url and also maintains and also maintains browser history
		
		String title = driver.getTitle();		
		System.out.println(title);
		
		driver.findElement(By.xpath(""));
		String selDate = "19";
		String selMonth = "may";
		String selyear = "2022";
		
		String month = driver.findElement(By.xpath("")).getText();
		String year = driver.findElement(By.xpath("")).getText();
		
		if(month.equals(selMonth) && year.equals(selyear)) {
			List<WebElement> allDates = driver.findElements(By.xpath(""));
			for(WebElement dates: allDates) {
				if(dates.getText().equals(selDate)) {
					dates.click();
					return;
				}
			}
		}

	}

}
