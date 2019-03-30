import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.String;


public class HomePage {
    private final WebDriver driver;
    By inputNeededSum = By.id("fn_s1");
    By searchUsdField = By.id("fn_c1");
  //  By searchBankCourse = By.id("fn_bank");
    By grivnaResult = By.id("fn_o1_1");
    By buttonBuy =By.xpath("html/body/div[5]/div[2]/div/div/div[2]/div[1]/div[3]/form/table/tbody/tr[1]/th[2]/ul/li[2]/i/span");

    public HomePage (WebDriver driver){
       this.driver = driver;
    }

    public HomePage inputValue(String neededSum) { //вводим данные
        driver.findElement(inputNeededSum).sendKeys(neededSum);
        return this;
    }

    public HomePage verifyCurrencyIsUsd (String verifyUsdIsDefault) {  //проверяем что текущая валюта USD
        driver.findElement(searchUsdField).sendKeys(verifyUsdIsDefault);
        return this;
    }

    public HomePage clickBuy() {   //нажимаем КУПИТЬ
        driver.findElement(buttonBuy).click();
        return this;
    }

    public String verifyResult( ) {
        return( driver.findElement(grivnaResult).getAttribute("value").replaceAll("\\u00A0+", "").replaceAll(",", ".")); // возвращаем результат в гривнах, заменяем удаляем пробел в результате, и заменяем запятую на точку
    }

}

