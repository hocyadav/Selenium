package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {

	public static void main(String[] args) {
		FirefoxProfile prof = new FirefoxProfile();
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		//prof.setPreference("browser.download.folderList",0);
		prof.setPreference("browser.download.folderList",2);
		prof.setPreference("browser.download.dir","C:\\automate download");
		WebDriver driver = new FirefoxDriver(prof);
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/download.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='https://bit.ly/2zm3ZzF']")).click();
		//boolean val =driver.findElement(By.xpath("//img[@src='img/logo.png']")).isDisplayed();
	}

}
