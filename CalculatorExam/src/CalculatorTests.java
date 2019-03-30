import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CalculatorTests {
    private CalculatorMain calculatorMain;
    private WebDriver driver;
    private int testDigitCapacity=3;
    @BeforeMethod
    public void setup(){
        driver =new FirefoxDriver();
        calculatorMain=new CalculatorMain(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://qa-automation.dio-soft.local:8080/calculator");
        calculatorMain.setDigitCapacityAndClickGenerateButton(Integer.toString(testDigitCapacity));
    }



    @Test (description = "Test that generated number has the same number of digits as requested")
    public void testGeneratedNumberOfDigitsIsAsExpected(){
        int actualNumberOfDigits=calculatorMain.getGeneratedNumberDigitCapacity(); //
        Assert.assertEquals(actualNumberOfDigits, testDigitCapacity);

//    @Test (description = "Test that generated number has the same number of digits as requested")
//    public void testGeneratedNumberOfDigitsIsAsExpected(){
//
//        calculatorMain.getGeneratedNumberDigitCapacity(calculatorMain.getGeneratedNumber()); //TODO ненужная строка, т.к. ты опять всё это используешь в Ассерте. Я б порекомендовал создать две переменные.
//
//        Assert.assertEquals(calculatorMain.getGeneratedNumberDigitCapacity(calculatorMain.getGeneratedNumber()), testDigitCapacity);
}

    @Test (description = "Test that the sum of calculated digits is as requested")
    public void testSumOfCalculatedDigitsIsAsExpected(){
    String generatedNumberFromUI=calculatorMain.getGeneratedNumber();
    int intGeneratedNumberFromUI=Integer.parseInt(generatedNumberFromUI);
    int expectedCalculatedSum=calculatorMain.getSumDigit(intGeneratedNumberFromUI);

        calculatorMain.clickDigitSumCalculationButton();

        Assert.assertEquals(calculatorMain.getCalculatedDititsSum(),expectedCalculatedSum);
}
    @AfterMethod
    public void tearDown() {
    driver.close();
}
}
