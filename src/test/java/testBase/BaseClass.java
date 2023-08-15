package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public static WebDriver driver;
	public ChromeOptions ops;
	public EdgeOptions opts;
	public ResourceBundle resourcebundle;
	public Logger logger;
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		resourcebundle = ResourceBundle.getBundle("config");
		
		logger = LogManager.getLogger(this.getClass());
		
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\okeog\\OneDrive\\Documents\\Nero Eclipse\\PricepallyProject\\drivers\\chromedriver.exe");
			ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			
			ops.setBinary("C:\\Users\\okeog\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
			driver = new ChromeDriver(ops);
		}
		else {
			opts = new EdgeOptions();
			opts.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(opts);
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(resourcebundle.getString("url"));
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	public String getRandomString() {
		RandomStringUtils.randomAlphabetic(8);
		return RandomStringUtils.randomAlphabetic(8);
	}
	public String getRandomNumbers() {
		return RandomStringUtils.randomNumeric(10);
	}
	
	public String captureScreen(String tname) throws IOException {
		
		
		String timestamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+ "\\screenshots\\" + tname + "_" + timestamp + ".png";
		
		try {
			FileUtils.copyFile(src, new File(destination));
		}
		catch(Exception e) {
			e.getMessage();
		}
		return destination;
	}


}
