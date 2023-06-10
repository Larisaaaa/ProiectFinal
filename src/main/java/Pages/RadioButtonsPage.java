package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class RadioButtonsPage extends BasePage {
    public RadioButtonsPage (WebDriver driver){

        super(driver);
    }

    //Locators for Radio Button Demo
    By MaleRadioButton = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/label[1]/input");
    public void clickOnTheMaleRadioButton(){ driver.findElement(MaleRadioButton).click();}
    By FemaleRadioButton = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/label[2]/input");
    public void clickOnTheFemaleRadioButton(){ driver.findElement(FemaleRadioButton).click();}
    By GetCheckedValueButton = By.id("buttoncheck");
    public void clickOnTheGetCheckedValueButton(){ driver.findElement(GetCheckedValueButton).click();}


    //Locator for Group Radio Buttons Demo
    By GenderMaleOption = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[1]/input");
    public void clickOnTheGenderMaleOption(){ driver.findElement(GenderMaleOption).click();}
    By GenderFemaleCheckBox = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[2]");
    public void clickOnTheGenderFemaleCheckbox(){ driver.findElement(GenderFemaleCheckBox).click();}
    By GenderOtherCheckBox = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[3]/input");
    public void clickOnTheGenderOtherCheckBox(){ driver.findElement(GenderOtherCheckBox).click();}

    By Age0to5CheckBox = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[1]/input");
    public void clickOnTheAge0to5Checkbox(){ driver.findElement(Age0to5CheckBox).click();}
    By Age5to15CheckBox = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[2]/input");
    public void clickOnTheAge5to15Checkbox(){ driver.findElement(Age5to15CheckBox).click();}
    By Age15to50CheckBox = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[3]/input");
    public void clickOnTheAge15to50Checkbox(){ driver.findElement(Age15to50CheckBox).click();}
    By GetValuesButton = By.xpath(" //*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button");
    public void clickOnTheGetValuesButton(){driver.findElement(GetValuesButton).click();}

    //Disabled Checkbox
    By CheckBox1 = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div/div/div/div[1]/label/input");
    public void clickOnTheCheckBox1(){driver.findElement(CheckBox1).click();}

    By CheckBox2 = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div/div/div/div[2]/label/input");
    public void clickOnTheCheckBox2(){driver.findElement(CheckBox2).click();}



}
