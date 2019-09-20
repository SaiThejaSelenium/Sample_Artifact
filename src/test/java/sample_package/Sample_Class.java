package sample_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample_Class {

	@Test
	public void launchbrowser() {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.12.0");
		driver.get("https://www.facebook.com");

		System.out.println(driver.getTitle());
		System.out.println("Hello world");
	}

}
