package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SelectDropdownListPage extends BasePage {
    public SelectDropdownListPage(WebDriver driver){

        super(driver);
    }

    //Locators for Select List Demo
    By SelectDayCheckBox = By.id("select-demo");
    public void clickOnTheSelectDayCheckBox(){ driver.findElement(SelectDayCheckBox).click();}


    //Locators for Multi Select List Demo
    By MultipleSelectStateCheckBox = By.id("multi-select");
    public void clickOnTheMultipleSelectStateCheckBox(){ driver.findElement(MultipleSelectStateCheckBox).click();}
    By FirstSelectedButton = By.id("printMe");
    public void clickOnTheFirstSelectButton(){ driver.findElement(FirstSelectedButton).click();}
    By GetAllSelectedButton = By.id("printAll");
    public void clickOnTheGetAllSelectedButton(){ driver.findElement(GetAllSelectedButton).click();}

}
