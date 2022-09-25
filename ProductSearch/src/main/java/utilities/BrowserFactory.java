package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Priyanka
 *
 * 
 */
public class BrowserFactory {

	public static WebDriver driver = null;

//**************************************************************************************************************	
	public static WebDriver getBrowser(String browser) {
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\priya\\Desktop\\WebDrivers_Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\priya\\Desktop\\WebDrivers_Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\priya\\Desktop\\WebDrivers_Selenium\\msedgedriver.exe");
			break;
		default:
			System.out.println("This browser is not supported.");
		}
		return driver;
	}

//**************************************************************************************************************	
}
