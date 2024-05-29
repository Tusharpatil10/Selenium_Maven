package comsample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tpatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("SeleniumTutorial")).click();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> windows = driver.getWindowHandles();
				for(String window : windows) {
					driver.switchTo().window(window);
					
					try {
					String text = driver.findElement(By.className("example")).getText();
					System.out.println(text);
					}catch(NoSuchElementException e) {
						driver.close();
					}
					
				}
	}

}
