package comsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxInselenium {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tpatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes"); 
		
		String title = driver.getTitle();		
		System.out.println(title);
		
		WebElement check = driver.findElement(By.xpath("//input[1]"));
		System.out.println("check box display :"+ check.isDisplayed());
		System.out.println("check box enable :"+ check.isEnabled());
		check.click();

	}

}
