package comsample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxButtonInSelenium {

	public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tpatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls"); // to maintains the browser history that's the different between get, and get just takes you to the particular url who takes you to the particular url and also maintains and also maintains browser history
		
		String title = driver.getTitle();		
		System.out.println(title);
		
		WebElement Button = driver.findElement(By.xpath("//button[text()='Enable']"));
		Button.isDisplayed();
		
		WebElement InputBox = driver.findElement(By.xpath("//input[@type='text']"));
		
		if(InputBox.isEnabled()) {
			System.out.println("Button is Enable");
		}else {
			Button.click();
//			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
//			WebElement msg = driver.findElement(By.id("message"));
//			if(msg.isDisplayed()) {
//				InputBox.click();
//				InputBox.sendKeys("Hello");
//			}else {
//				System.out.println("Message is not display");
//			}
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
			wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("message")),"It's enabled!"));
			
			System.out.println("button:  "+ InputBox.isEnabled());
			InputBox.sendKeys("Hello");
		}

	}

}
