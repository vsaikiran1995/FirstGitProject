package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilFunctions.BaseClass;

public class HomePage{
	
	public WebDriver driver;
	
	By firstName=By.xpath("//*[@id='ybarAccountMenuOpener']/span");
	By Mail=By.xpath("//span[text()='Mail']");
	By compose=By.xpath("//span[text()='Compose']");
	By links = By.tagName("a");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getFirstName(){
		return driver.findElement(firstName);
	}
	
	public WebElement getMail(){
		return driver.findElement(Mail);
	}
	
	public WebElement getCompose(){
		return driver.findElement(compose);
	}
	
	public List<WebElement> getLinks(){
		return driver.findElements(links);
	}
	
	
	public void abc(){
		System.out.println("sdfghjk");
		System.out.println("sdfghjk");
		System.out.println("sdfghjk");
	}

	
}
