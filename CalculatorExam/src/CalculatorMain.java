import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 */
public class CalculatorMain {
    private final WebDriver driver;
    By digitCapacityLocator = By.id("numberForm");
    By generatedNumberLocator = By.id("generatedNumber");
    By digitSumLocator = By.name("digitSum");
    By generateNumberButtonLocator = By.xpath("Generate number");
    By calculateDigitSumLocator = By.name("calculate");

    public CalculatorMain(WebDriver driver) {
        this.driver = driver;
    }

    public CalculatorMain setDigitCapacityAndClickGenerateButton(String inputtedDigitCapacity) {  //function for inputting values to the digit capacity field
        driver.findElement(digitCapacityLocator).sendKeys(inputtedDigitCapacity);
        driver.findElement(generateNumberButtonLocator).click();
        return this;
    }

    public String getGeneratedNumber() {  //function for returning values from the digitcapacity field
        return driver.findElement(generatedNumberLocator).getAttribute("value");
    }

    public int getGeneratedNumberDigitCapacity(){  // метод для подсчета количества цифр числа (1)
        String generatedNumber= driver.findElement(generatedNumberLocator).getAttribute("value");
        int receivedGeneratedNumber=generatedNumber.length();
        return receivedGeneratedNumber;
    }

//    public int getGeneratedNumberDigitCapacity(String receivedGeneratedNumber){ // метод для подсчета количества цифр числа (2) / метод хороший и правильно, что написал. Но это для "себя": потренькаться с процедурным программированием. Для твоих тестов он не нужен, для них достаточно взять getGeneratedNumber().length()
//        int count=0;
//        int intReceivedGeneratedNumber=Integer.parseInt(receivedGeneratedNumber);
//        while (intReceivedGeneratedNumber!=0) {
//            if (intReceivedGeneratedNumber%10>0){
//                count++;
//                intReceivedGeneratedNumber=intReceivedGeneratedNumber/10;
//            }
//        }
//        return count;
//    }

    public CalculatorMain clickDigitSumCalculationButton() { // click the calculate digit sum button
        driver.findElement(calculateDigitSumLocator).click();
        return this;
    }

    public String getCalculatedDititsSum() {  //get the value from digitSumLocator
        return driver.findElement(digitSumLocator).getAttribute("value");
    }

    public int getSumDigit(int numb) { //функция, которая считает сумму цифр числа (доп. задание)
        int sum=0;
        while (numb!=0){
            sum+=numb%10; //Печатаю крайнюю правую цифру числа `numb`
            numb=numb/10; //Изменяю переменную `numb` таким образом, чтобы она стала равна числу из оставшихся цифр
        }
        return sum;
    }

    /**
     procedure for calculating the sum of digits in a number
     *   public static void getSumDigit() { //20 функция, которая считает сумму цифр числа
     int sum=0;
     int numb=16234;
     while (numb!=0){
     sum+=numb%10; // Печатаем крайнюю правую цифру числа `numb`
     numb=numb/10; // Изменяем переменную `numb` таким образом, чтобы она стала равна числу из оставшихся цифр
     }
     System.out.println("sum is " +sum);
     */
}