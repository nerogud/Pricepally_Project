package testBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver;
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
			ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
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
		return RandomStringUtils.randomNumeric(7);
	}


}
