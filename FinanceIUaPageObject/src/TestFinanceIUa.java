import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestFinanceIUa {
    private HomePage financeIUa;
    private WebDriver driver; //создаю переменную driver, чтоб она была видна всему классу




    @BeforeMethod(alwaysRun = true)
    public void setup(){
        driver =new FirefoxDriver(); // с помощью этой конструкции вызываю обьект driver(инициализация драйвера)
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //указываю задержку
        driver.get("http://finance.i.ua"); //указываю драйверу какую страницу открыть
    }

    @Test
    public void testCurrency(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //указываю задержку
        financeIUa=new HomePage(driver);
        financeIUa.inputValue("100");
        financeIUa.verifyCurrencyIsUsd("USD");
        financeIUa.clickBuy();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(financeIUa.verifyResult(), "2638.12");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
    driver.close();
       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //указываю задержку
    }
}
