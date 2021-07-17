package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver;

	By username=By.name("username");
	By password=By.id("login-passwd");
	By nextBtn=By.name("signin");	
	By loginBtn=By.id("login-signin");


	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getNextBtn()
	{
		return driver.findElement(nextBtn);
	}
	
	public WebElement getLoginBtn()
	{
		return driver.findElement(loginBtn);
	}
}
