import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
/*
*/
public class HotelPage {
    private final WebDriver driver;
    By nameLocator=By.id("add_hotel:name");
    By dataLocator=By.xpath("//span[text()='Data:']");
    By globalratingICancel=By.xpath("//*[@id='add_hotel:rate']/div[1]");
    By globalRatingFieldLocator=By.id("add_hotel:rate");
    By globalRatingIsOne=By.xpath("//*[@id='add_hotel:rate']/div[2]");
    By globalratingIsTwo=By.xpath("//*[@id='add_hotel:rate']/div[3]");
    By globalratingIsThree=By.xpath("//*[@id='add_hotel:rate']/div[4]");
    By globalratingIsFour=By.xpath("//*[@id='add_hotel:rate']/div[5]");
    By globalratingIsFive=By.xpath("//*[@id='add_hotel:rate']/div[6]");
    By dateOfConstructionTextLocator=By.id("add_hotel:dateOfConstruction_input");
    By dateOfConstructionButtonLocator=By.xpath("//span[text()='ui-button']/..");
    By currentDateOfConstruction=By.xpath("ui-state-default ui-state-highlight ui-state-active");
    By dateOfConstructionManualInput=By.id("add_hotel:dateOfConstruction_input");
    By countryLocator=By.id("add_hotel:country_label"); //locator for adding a country
    By countryUkraineLocator=By.xpath("//li[text()='Ukraine']");  //locator for selecting Ukraine
    By countryUsaLocator=By.xpath("//li[text()='USA']/.."); //locator for selecting USA
    By countryUkLocator=By.xpath("//li[text()='UK']/.."); //locator for selecting UK
    By cityLocator=By.id("add_hotel:city_label");  //locator for adding a city
    By cityKyivLocator=By.xpath("//li[text()='Kyiv']/."); //locator for selecting Kyiv
    By cityLondonLocator=By.xpath("//li[text()='London']/."); //locator for selecting London
    By cityChicagoLocator=By.xpath("//li[text()='Chicago']/."); //locator for selecting Chicago
    By shortDescriptionLocator=By.id("add_hotel:short_description");
    By descriptionLocator=By.id("add_hotel:description");
    By notesLocator=By.id("add_hotel:notes");
    By saveButtonLocator=By.xpath("//span[text()='Save']/..");
    By asteriskNameLocator=By.xpath("//label[text()='Name:']/span[text()='*']");
    By asteriskDateOfConstructionLocator=By.xpath("//label[text()='Date of Construction:']/span[text()='*']");
    By asteriskCountryLocator=By.xpath("//label[text()='Country:']/span[text()='*']");
    By asteriskCityLocator=By.xpath("//label[text()='City:']/span[text()='*']");
    By asteriskShortDescriptionLocator=By.xpath("//label[text()='Short Description:']/span[text()='*']");
    By asteriskDescriptionLocator=By.xpath("//label[text()='Description:']/span[text()='*']");
    By nameWarning=By.xpath("//span[text()='Name: Validation Error: Value is required.']");
    By dateOfConstructionWarning=By.xpath("//span[text()='Date of Construction: Validation Error: Value is required.']");
    By countryWarning=By.xpath("//span[text()='Country: Validation Error: Value is required.']");
    By CityWarning=By.xpath("//span[text()='City: Validation Error: Value is required.']");
    By DescriptionWarning=By.xpath("//span[text()='Description: Validation Error: Value is required.']");



    public HotelPage(WebDriver driver){
        this.driver=driver;
    }

    private HotelPage selectItem(String item){      // Selection of a country
        driver.findElement(By.xpath("//li[@data-label='"+item+"']")).click();
        return this;
    }
    public HotelPage selectCountry(String country){  //return for a selected country
        driver.findElement(countryLocator).click();
        return selectItem(country);
    }

    public boolean isDataSectionDisplayed(){    //verification that data section is displayed
        return driver.findElement(dataLocator).isDisplayed();
    }
    public boolean isSaveButtonDisplayed(){ //verification that save button is displayed
        return  driver.findElement(saveButtonLocator).isDisplayed();
    }
    public boolean isGlobalRatingFieldDisplayed() {return driver.findElement(globalRatingFieldLocator).isDisplayed();}

    public boolean isNameLabelCorrect(){  //check for availability of asterisks in Name field
        return driver.findElement(asteriskNameLocator).isDisplayed();
    }
    public boolean asteriskDateOfConstruction(){ //check for availability of asterisks in Date of Construction field
        return driver.findElement(asteriskDateOfConstructionLocator).isDisplayed();
    }
    public boolean asteriskCountryField(){ //check for availability of asterisks in Country field
        return driver.findElement(asteriskCountryLocator).isDisplayed();
    }
    public boolean asteriskCityField(){ //check for availability of asterisks in Description field
        return driver.findElement(asteriskCityLocator).isDisplayed();
    }
    public boolean asteriskShortDescription(){  //check for availability of asterisks in Short Description field
        return driver.findElement(asteriskShortDescriptionLocator).isDisplayed();
    }
    public boolean asteriskDescription(){ //check for availability of asterisks in Description field
        return driver.findElement(asteriskDescriptionLocator).isDisplayed();
    }


    public HotelPage inputNameValue(String nameLocatorText) {  //Name field methods
        driver.findElement(nameLocator).sendKeys(nameLocatorText);
        return this;
    }
    public String getNameValue() {
       return driver.findElement(nameLocator).getAttribute("value");
    }


    public HotelPage globalRatingSetToOne (){  // verification that it is possible to set global rating to one
       driver.findElement(globalRatingIsOne).click();
        return this;
    }
    public HotelPage globalRatingSetToTwo(){
        driver.findElement(globalratingIsTwo).click();
        return this;
    }
    public HotelPage globalRatingSetToThree(){
        driver.findElement(globalratingIsThree).click();
        return this;
    }
    public HotelPage globalRatingSetToFour(){
        driver.findElement(globalratingIsFour).click();
        return this;
    }
    public HotelPage globalRatingSetToFive(){
        driver.findElement(globalratingIsFive).click();
        return this;
    }

    public HotelPage inputDateOfConstructionByClickingButton(){  //clicking date of construction button
        driver.findElement(dateOfConstructionButtonLocator).click();
        driver.findElement(currentDateOfConstruction).sendKeys(Keys.ENTER);
        return this;
    }

 public HotelPage inputDateOfConstructionManualValue (String  dateOfConstructionManualText){  // methods for manual date of Construction input
     driver.findElement(dateOfConstructionManualInput).sendKeys(dateOfConstructionManualText);
     return this;
 }
    public String getDateOfConstructionManualValue(){
        return driver.findElement(dateOfConstructionManualInput).getAttribute("value");
    }

    //method for mandatory country selection TODO



    //method for mandatory city selection TODO




    public HotelPage inputShortDescriptionValue(String shortDescriptionLocatorText) { //Short Description field methods
        driver.findElement(shortDescriptionLocator).sendKeys(shortDescriptionLocatorText);
        return this;
    }
    public String getShortDescriptionValue () {
        return driver.findElement (shortDescriptionLocator).getAttribute("value");
    }


    public HotelPage inputDescriptionValue (String descriptionLocatorText){  //Description field methods
        driver.findElement(descriptionLocator).sendKeys(descriptionLocatorText);
        return this;
    }
    public String getDescriptionValue (){
        return driver.findElement(descriptionLocator).getAttribute("value");
    }



    public HotelPage inputNotesValue(String notesLocatorText){ //Notes field method
        driver.findElement(notesLocator).sendKeys(notesLocatorText);
        return this;
    }
    public String getNotesValue(){
        return driver.findElement(notesLocator).getAttribute("value");
    }

    public HotelPage clickSaveButton(){
        driver.findElement(saveButtonLocator).click();
        return this;
    }

    public ListOfAllHotels createHotel(Hotel hotel){ //TODO

        return null;
    }





}
