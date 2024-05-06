package comsample;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumFirstScript {

	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
		
//		WebDriver driver = WebDriverManager.chromedriver().create();
//		driver.get("http://www.google.com");
//	    driver.quit();	
		
		List<WebDriver> browserList = WebDriverManager.chromedriver().create(3);
		browserList.get(0).get("http://www.facebook.com");
		System.out.println("Title1 is " + browserList.get(0).getTitle());
		
		browserList.get(1).get("http://www.linkedin.com");
		System.out.println("Title2 is " + browserList.get(1).getTitle());
		
		browserList.get(2).get("http://www.ineuron.ai");
		System.out.println("Title3 is " + browserList.get(2).getTitle());
		
		
		
	}

}
