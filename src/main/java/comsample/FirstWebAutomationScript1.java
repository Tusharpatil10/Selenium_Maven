package comsample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstWebAutomationScript1 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		driver.findElement(By.linkText("New user? Signup")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("name")).isDisplayed();
		
		if(driver.findElement(By.className("submit-btn")).isEnabled()){
			System.out.println("Button is Enable");
		}else {
			System.out.println("Button is Disable");
		}
		
		driver.findElement(By.id("name")).sendKeys("tushar");
		
		driver.findElement(By.id("email")).sendKeys("tushar.patil@sopras.com");
		
		driver.findElement(By.id("password")).sendKeys("tushar123");
		
		driver.findElement(By.xpath("//label[text()='testing']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("gender")).click();
		

		WebElement state = driver.findElement(By.id("state"));
		Select stateDropdown = new Select(state);
		System.out.println(stateDropdown.isMultiple());
		
		stateDropdown.selectByIndex(2);
		System.out.println(stateDropdown.getFirstSelectedOption().getText());
		
		stateDropdown.selectByValue("Gujarat");
		System.out.println(stateDropdown.getFirstSelectedOption().getText());
		
		stateDropdown.selectByVisibleText("Goa");
		System.out.println(stateDropdown.getFirstSelectedOption().getText());
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> allValues = stateDropdown.getOptions();
		for(WebElement ele : allValues) {
//			System.out.println(ele.getText());
			String stateName = ele.getText();
			System.out.println("State Names " + stateName);
			if(stateName.contains("Karnataka")) {
				System.out.println("State Present");
				break;
			}
		}		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
//		driver.findElement(By.className("submit-btn")).click();
		WebElement signup = driver.findElement(By.className("submit-btn"));
		if(signup.isDisplayed()) {
			signup.click();
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("email1")).sendKeys("tushar.patil@soprasteria.com");
		
		driver.findElement(By.id("password1")).sendKeys("tushar123");
		
		driver.findElement(By.className("submit-btn")).click();
		
//		String home = driver.findElement(By.xpath("//h2[text()='Cypress']")).getText();
//		if(home.contains("Cypress")) {
//			System.out.println("we are successfully landing on Enrollement page");
//		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
	}

}
