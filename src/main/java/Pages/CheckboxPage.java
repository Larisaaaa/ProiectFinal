package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage extends BasePage{
    public CheckboxPage(WebDriver driver){
        super(driver);
    }

    By SingleCheckbox = By.id("isAgeSelected");
    public void clickOnSingleCheckbox(){ driver.findElement(SingleCheckbox).click();}

    By Checkbox1 = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/input");
    public void clickOnTheFirstCheckboxOption(){driver.findElement(Checkbox1).click();}
    By Checkbox2 = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/input");
    public void clickOnTheSecondCheckboxOption(){driver.findElement(Checkbox2).click();}

    By Checkbox3 = By.id("/html/body/div[1]/div/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/div[4]/input");
    public void clickOnTheThirdCheckboxOption(){driver.findElement(Checkbox3).click();}

    By Checkbox4 = By.xpath("ex1-check3");
    public void clickOnTheForthCheckboxOption(){driver.findElement(Checkbox4).click();}

    By CheckAllButton = By.id("box");
    public void clickOnTheCheckAllButton(){driver.findElement(CheckAllButton).click();}

    By UncheckAllButton = By.xpath("//*[@id=\"box\"]");
    public void clickOnTheUncheckAllButton(){driver.findElement(UncheckAllButton).click();}
}

