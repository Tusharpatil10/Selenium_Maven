package comsample;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertinselenium {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("See an example alert")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.linkText("See a sample prompt")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Alert alert = driver.switchTo().alert();
		
		
	}

}
