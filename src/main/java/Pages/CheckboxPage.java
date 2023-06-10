package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage extends BasePage{
    public CheckboxPage(WebDriver driver){
        super(driver);
    }

    By SingleCheckbox = By.id("isAgeSelected");
    public void clickOnSingleCheckbox(){ driver.findElement(SingleCheckbox).click();}

    //Disabled Checkbox Demo
    By Checkbox1 = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/input");
    public void clickOnTheCheckbox1(){driver.findElement(Checkbox1).click();}
    By Checkbox2 = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/input");
    public void clickOnTheCheckbox2(){driver.findElement(Checkbox2).click();}

    By DisabledCheckbox = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div/div/div/div[3]/label/input");
    public void clickOnTheDisabledCheckbox(){driver.findElement(Checkbox2).click();}


    //Multiple Checkbox Demo

    By Option1 = By.xpath("//*[@id=\"ex1-check1\"]");
    public void clickOnTheOption1(){driver.findElement(Option1).click();}

    By Option2 = By.xpath("//*[@id=\"ex1-check2\"]");

    public void clickOnTheOption2(){driver.findElement(Option2).click();}

    By Option3 = By.xpath("//*[@id=\"ex1-check3\"]");
    public void clickOnTheOption3(){driver.findElement(Option3).click();}

    By Option4 = By.xpath("//*[@id=\"ex1-check3\"]");
    public void clickOnTheOption4(){driver.findElement(Option4).click();}


    By CheckAllButton = By.id("box");
    public void clickOnTheCheckAllButton(){driver.findElement(CheckAllButton).click();}

    By UncheckAllButton = By.xpath("//*[@id=\"box\"]");
    public void clickOnTheUncheckAllButton(){driver.findElement(UncheckAllButton).click();}
}

