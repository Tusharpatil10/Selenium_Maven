package comsample;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFilesInSelenium {
	
	private static String filePath = "C:\\Users\\tpatil\\Downloads\\";
	private static String fileName = "sample3.pdf";
//	private static String desired_Download_filePath = "C:\\ChromeDownloads\\";

	public static void main(String[] args) throws InterruptedException {
		
//		HashMap hm = new HashMap();
//		hm.put("downloade.default_directory", desired_Download_filePath);
//		
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("prefs", hm);
//		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tpatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://filesamples.com/formats/pdf");
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='output']/div[1]/a")).click();
		System.out.println("Before download file exists:" + isFileExists(filePath + fileName));

		Thread.sleep(5000);
		
		System.out.println("After download file exists:" + isFileExists(filePath + fileName));
		
		
	}

	private static boolean isFileExists(String filePath) {
		File f = new File(filePath);
		if(f.exists()) {
			return true;
		}
		return false;
	}

}
