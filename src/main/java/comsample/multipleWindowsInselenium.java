package comsample;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleWindowsInselenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/");
		
		String parent = driver.getWindowHandle();
		System.out.println("parent window handle:" + parent);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.findElement(By.partialLinkText("window")).click();
	
		System.out.println("Child Windows: " + driver.getWindowHandles());
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> I = s.iterator();
		while(I.hasNext()){
			String childWindows =I.next();
			if(!parent.equals(childWindows)) {
				driver.switchTo().window(childWindows);
				System.out.println("Child Windows: " + driver.getWindowHandles());
			}
		}
		
//		driver.get("https://www.google.com/");
		


	}

}
