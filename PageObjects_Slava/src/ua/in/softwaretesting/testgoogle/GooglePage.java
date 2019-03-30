package ua.in.softwaretesting.testgoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {
	private final WebDriver driver;
	By searchFieldLocator = By.name("q");
    By searchButtonLocator = By.xpath("//button[@aria-label='Поиск в Google']");
    By footballUALocator = By.partialLinkText("Football.ua");

	public GooglePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public GooglePage setValue(String text){
		driver.findElement(searchFieldLocator).sendKeys(text);
		return this;
	}
	
	public GooglePage clickFind(){
		driver.findElement(searchButtonLocator).click();
		return this;
	}
	
	public FootballUaPage clickLink(String caption){
		driver.findElement(footballUALocator).click();
		return new FootballUaPage();
	}
}



