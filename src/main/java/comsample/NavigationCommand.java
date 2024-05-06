package comsample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tpatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/"); // to maintains the browser history that's the different between get, and get just takes you to the particular url who takes you to the particular url and also maintains and also maintains browser history
		String title = driver.getTitle();		
		System.out.println(title);
		
//		String pageUrl = driver.getCurrentUrl();
		System.out.println("We Are On Home Page: " + driver.getCurrentUrl());
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Alexa" , Keys.ENTER);
		
		System.out.println("We Are On Home Page: " + driver.getCurrentUrl());
		
		driver.navigate().back();
		
		System.out.println("We Are On Home Page: " + driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		System.out.println("We Are On Home Page: " + driver.getCurrentUrl());

	}

}
