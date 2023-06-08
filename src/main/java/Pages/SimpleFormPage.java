package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class SimpleFormPage extends BasePage{


        public SimpleFormPage(WebDriver driver){

            super(driver);
        }

        //Locators for Simple Input Field
        By SimpleFormDemoButton = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a");
        By TextField = By.id("user-message");
        By YourMessage = By.id("message");
        By GetCheckedValue = By.id("showInput");
        public void clickOnGetCheckedValue(){ driver.findElement(GetCheckedValue).click();}

        //Locators for Two Input Fields
        By TwoInputFieldsEnterA = By.id("sum1");
        By TwoInputFieldsEnterB = By.id("sum2");
        By GetValuesButton = By.xpath("//*[@id=\"gettotal\"]/button");

        //Method to click on Single and Two input fields
        public void selectTextField(String arg1) {driver.findElement(TextField).sendKeys(arg1);}
        public void enterA(String arg2){driver.findElement(TwoInputFieldsEnterA).click();}
        public void enterB(String arg3){driver.findElement(TwoInputFieldsEnterB).click();}
        public void clickOnGetValuesButton(){driver.findElement(GetValuesButton).click();}

    }


