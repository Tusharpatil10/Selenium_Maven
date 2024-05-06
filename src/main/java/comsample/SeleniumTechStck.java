package comsample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTechStck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tpatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airbnb.co.in");
		driver.navigate().to("https://www.amazon.in/"); // to maintains the browser history that's the different between get, and get just takes you to the particular url who takes you to the particular url and also maintains and also maintains browser history
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement destination = driver.findElement(By.name("query"));
		destination.click();
		destination.sendKeys("Goa" , Keys.ENTER);

	}

}
