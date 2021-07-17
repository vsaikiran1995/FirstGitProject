package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailingPageObject {

	public WebDriver driver;
	
	By emailIcon=By.id("ybarMailLink");
	By composeBtn=By.xpath("//span[text()='Compose']");
	By toemailAdd=By.id("message-to-field");	
	By subject=By.id("compose-subject");
	By body=By.xpath("//div[@data-test-id='rte']");
	By sendBtn=By.xpath("//span[text()='Send']");
	
	public MailingPageObject(WebDriver driver){
		this.driver=driver;
	}
	
	public WebElement getEmailIcon(){
		return driver.findElement(emailIcon);
	}
	
	public WebElement getComposeBtn(){
		return driver.findElement(composeBtn);
	}
	
	public WebElement getToemailAdd(){
		return driver.findElement(toemailAdd);
	}
	
	public WebElement getSubject(){
	    return driver.findElement(subject);	
	}
	
	public WebElement getBody(){
		return driver.findElement(body);
	}
	
	public WebElement getSendBtn(){
		return driver.findElement(sendBtn);
	}
}
