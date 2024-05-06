package comsample;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class ScreenShortInSelenium {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tpatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
//		File destFile = new File("C:\\Users\\tpatil\\OneDrive - Sopra Steria\\Pictures\\Screenshots\\selenium.png");
//		FileUtils.copyFile(srcFile, destFile);
//		System.out.println("ScreenShot Taken");
		
		
		Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(s.getImage(), "png", new File("C:\\Users\\tpatil\\OneDrive - Sopra Steria\\Pictures\\Screenshots\\seleniumimage.png"));
        System.out.println("Screenshot taken");
		
	}

}
