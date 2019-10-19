package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.api.Scenario;

public class utils {
	public static WebDriver driver;
	
	public static void acessarSite() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}
	
	public static void capturarScreenshot(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed( screenshot  , "image/png");
		
	}

}
