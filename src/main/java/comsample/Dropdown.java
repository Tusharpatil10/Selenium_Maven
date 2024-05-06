package comsample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\tpatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dropdown"); 
		
		String title = driver.getTitle();		
		System.out.println(title);
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		Select values = new Select(dropdown); 
		values.selectByIndex(2);
		values.selectByValue("1");
		values.selectByVisibleText("Option 2");
		List<WebElement> totalvalues = values.getOptions();
		for(WebElement total : totalvalues) {
			System.out.println(total.getText());
		}

	}

}
