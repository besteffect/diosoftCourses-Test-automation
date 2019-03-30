package ua.in.softwaretesting.testgoogle;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GooglePage {
	final WebDriver driver;
	@FindBy(how=How.NAME, using="q")
	private WebElement searchField;
	@FindBy(how=How.XPATH, using="//button[@aria-label='����� � Google']")
	private WebElement searchButton;
	@FindBy(how=How.XPATH, using="//a[@href='http://football.ua/']")
	private WebElement footballUa;

	public GooglePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public GooglePage setValue(String text){
		searchField.sendKeys(text);
		return this;
	}
	
	public GooglePage clickFind(){
		searchButton.click();
		return this;
	}
	
	public FootballUaPage clickLink(String caption){
		footballUa.click();
		return new FootballUaPage();
	}
}

