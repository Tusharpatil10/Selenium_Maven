package comsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstWebAutomationScript {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		
		driver.get("https://ineuron-courses.vercel.app/login");
		String url = driver.getCurrentUrl();
		System.out.println("URL IS :" + url);
		if(url.contains("login")) {
			System.out.println("Landing on login page");
		}else {
			System.out.println("login page not appeared");
		}
		
		String title = driver.getTitle();
		System.out.println("Title :" + title);
		
		String pagesrc = driver.getPageSource();
		System.out.println("PageSource :" + pagesrc);
		
		WebElement username = driver.findElement(By.name("email1"));
		username.isDisplayed();
		username.sendKeys("tushar.patil@soprasteria.com");
		
		driver.findElement(By.id("password1")).sendKeys("tushar123");
		
		driver.findElement(By.className("submit-btn")).click();
		
		Thread.sleep(3000);
		String errormsg = driver.findElement(By.className("errorMessage")).getText();
		if (errormsg.contains("USER Email Doesn't Exist")) {
			System.out.println("Message Verified");
		}else {
			System.out.println("Could not verify message");
		}
		
//		driver.close();
		
	}

}
