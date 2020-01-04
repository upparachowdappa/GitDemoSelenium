package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class base {

	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {

		// chrome
		// Firefox

		prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Chandu\\workspace\\MavenProject\\E2EProject\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);

		String browser = System.getProperty("browser");

		String browserName = prop.getProperty("browser");

		if (browserName.contains("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C://Users//Chandu//Desktop//geckodriver//chromedriver//chromedriver.exe");

			// ChromeOptions options=new ChromeOptions();

			// options.addArguments("headless");

			// if(browserName.contains("headless")) {

			// options.addArguments("headless"); }

			driver = new ChromeDriver();
		}

		else if (browserName.equals("firefox")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandu\\Desktop\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

	/*
	 * public void getScreenshot(String results)throws IOException
	 * 
	 * {
	 * 
	 * File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(src,new
	 * File("C:\\Users\\Chandu\\Sreenshorts\\"+result+"Screenshot.png"));
	 * 
	 * }
	 */

}
