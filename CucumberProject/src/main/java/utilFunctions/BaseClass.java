package utilFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.LoginPageObjects;

public class BaseClass {

	public static WebDriver driver;
	Actions act;
	WebDriverWait wait = new WebDriverWait(driver,20);
	
	public WebDriver driverInit(){
		System.setProperty("webdriver.chrome.driver", "D:\\downloads\\driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		return driver;
	}
	
	public void openApp(){
		driver.get("https://login.yahoo.com/");
	}

	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://test//"+result+"screenshot.png"));
	}
	
	public void loginApp(String username, String password) throws InterruptedException{
		LoginPageObjects lpo = new LoginPageObjects(driver);
    	lpo.getUsername().sendKeys(username);
    	lpo.getNextBtn().click();
    	Thread.sleep(2000);
    	lpo.getPassword().sendKeys(password);
	}

	public void hoverAction(WebElement element){
		act = new Actions(driver);
		act.moveToElement(element).build().perform();;
	}
	
	
	public void customWaitersByVisibleOfElement(WebElement element){
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
	}
	
	public void customWaitersByPresenceOfElementLocated(WebElement element){
		wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
	}
	
	public void customWaitersByElementToBeClickable(WebElement element){
		wait.until(ExpectedConditions.elementToBeClickable((By) element));
	}

}
