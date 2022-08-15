package blazeflights;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlazeSample {
	
	@Test
	
	private void loginPage() {
		
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://blazedemo.com/");
		
	
		
		
	}

}
