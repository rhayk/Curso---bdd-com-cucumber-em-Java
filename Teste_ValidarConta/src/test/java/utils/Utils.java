package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.api.Scenario;



public class Utils {
	public static WebDriver driver;
	
	public static void acessarSite() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://srbarriga.herokuapp.com");
	}
	
	public static void capturarScreenshot(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}

}

