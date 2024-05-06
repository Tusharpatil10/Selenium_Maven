package comsample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tpatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action =new Actions(driver);
		
		action.doubleClick(doubleclick).build().perform();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(rightclick).perform();
		System.out.println("Hello");
		driver.findElement(By.xpath("//ul//li[@class=\"context-menu-item context-menu-icon context-menu-icon-edit\"]/span")).click();
		driver.switchTo().alert().accept();
		System.out.println("Hello");
		
		
		
//		Action actions = new Actions(driver);
//		WebElement automate = driver
//	    action.moveToElement(automate)
		
//		WebElement source = driver.findElement(null);
//		WebElement target = driver.findElement(null);
//		
//		actions.dragAndDrop(source, target).perfrom();
//		actions.dragAndDropBy(source, 100,-100).perfrom();
//		
//		action.clickAndHold(source).moveToElement(target).release().perform();
		
		
	}
}
