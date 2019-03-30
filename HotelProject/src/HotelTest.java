import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class HotelTest {
    private HotelPage hotelPage;
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver =new FirefoxDriver(); // с помощью этой конструкции вызываю обьект driver(инициализация драйвера)
        hotelPage=new HotelPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //указываю задержку
        driver.get("http://localhost:8080/article/faces/hotel.xhtml"); //указываю драйверу какую страницу открыть (локально)
    }

    @Test(description = "Test that data section is displayed")
    public void testIsDataSectionIsDisplayed(){
        Assert.assertTrue(hotelPage.isDataSectionDisplayed());
    }
    @Test (description = "Test that Save button is displayed")
    public void testSaveButtonIsDisplayed(){
        Assert.assertTrue(hotelPage.isSaveButtonDisplayed());
    }
    @Test (description = "Test that global rating field is displayed")
    public void testisGlobalRatingFieldDisplayed(){Assert.assertTrue(hotelPage.isGlobalRatingFieldDisplayed());}

    @Test  (description="/test of the name field")
    public void testNameIsEditable(){
        String someValue="test435";
        hotelPage.inputNameValue(someValue);
        Assert.assertEquals(hotelPage.getNameValue(), someValue);
    }

    @Test(description = "Test that Global rating field can be set")
    public void testGlobalRatingCanBeSet(){
        hotelPage.globalRatingSetToOne();
        hotelPage.globalRatingSetToTwo();
        hotelPage.globalRatingSetToThree();
        hotelPage.globalRatingSetToFour();
        hotelPage.globalRatingSetToFive();
    }

    @Test (description = "Test that date of construction can be set")
    public void testinputDateOfConstructionByClickingButton(){
        hotelPage.inputDateOfConstructionByClickingButton();
    }

    @Test (description="test for shortDescription field test")
    public void testShortDescriptionFieldIsEditable(){
        String testValue ="testShortDescription434";
        hotelPage.inputShortDescriptionValue(testValue);
        Assert.assertEquals(hotelPage.getShortDescriptionValue(),testValue);
    }

    @Test (description= "test that description field is editable")
    public void testDescriptionFieldIsEditable(){
        String testValue="testDescriptionValue343";
        hotelPage.inputDescriptionValue(testValue);
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        Assert.assertEquals(hotelPage.getDescriptionValue(),testValue);
    }

    @Test (description="test that notes field is editable")
    public void testNotesFieldIsEditable(){
        String testValue="testNotesValue8543";
        hotelPage.inputNotesValue(testValue);
        Assert.assertEquals(hotelPage.getNotesValue(),testValue);
    }
    @Test  (description = "Asterisk availability tests")
    public void testAllasteriscsAreAvailable(){  //Test that all asterisks are available
        Assert.assertTrue(hotelPage.isNameLabelCorrect());
        Assert.assertTrue(hotelPage.asteriskDateOfConstruction());
        Assert.assertTrue(hotelPage.asteriskCountryField());
        Assert.assertTrue(hotelPage.asteriskCityField());
        Assert.assertTrue(hotelPage.asteriskShortDescription());
        Assert.assertTrue(hotelPage.asteriskDescription());
    }


    @Test (description = "test that all values are saved correctly") //TODO
    public void testDataIsSaved(){
    String someNameValue="test424";
    String shortDescriptionTestValue="test short description23";
    String descriptionTestValue="test Description value34";
    String notesTestValue="test notes Value34";
    hotelPage.inputNameValue(someNameValue); //input name
    hotelPage.globalRatingSetToFive(); //global rating is set to 5
    hotelPage.inputDateOfConstructionByClickingButton(); //input DateOfConstruction
    //input Country
    //input City
    hotelPage.inputShortDescriptionValue(shortDescriptionTestValue);  //input Short Description
    hotelPage.inputDescriptionValue(descriptionTestValue);  //input Description
    hotelPage.inputNotesValue(notesTestValue);  //input notes
    hotelPage.clickSaveButton();   //click Save. Expected result- ListOfAllHotels page
}
    @Test (description = "test that valid fields are saved correctly") //TODO
    public void testValidFieldsAreSaved(){
    }

    @Test (description = "test information is not saved when not all mandatory fields are filled in") //TODO
    public void testEmtpyDataIsNotSaved (){
    }

    @Test (description = "Verification of error messages") //TODO

    @AfterMethod//(alwaysRun = true)
    public void tearDown() {
        driver.close();

    }
}
