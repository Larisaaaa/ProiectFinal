package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class JQuerySelectDropdownPage extends BasePage  {
    public JQuerySelectDropdownPage(WebDriver driver){
        super(driver);
    }

    //Locators for Single Select - Search and Select country
    By SelectCountryCheckBox = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div[2]/span/span[1]/span");
    public void clickOnTheSelectCountryCheckBox(){ driver.findElement(SelectCountryCheckBox).click();}


    By TextBoxCountry = By.xpath("/html/body/span/span/span[1]/input");
    public void enterTextBox(String arg2){driver.findElement(TextBoxCountry).click();}

    By SelectCountryIndia = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div[2]/span/span[1]/span/span[1]");
    public void clickOnTheSelectCountryIndia(){ driver.findElement(SelectCountryIndia).click();}



    //Locators for Multi Select - Search and Select multiple states
    By SelectMultipleStatesCheckBox = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div[2]/span/span[1]/span/ul/li/input");
    public void clickOnTheSelectMultipleStatesCheckBox(){ driver.findElement(SelectMultipleStatesCheckBox).click();}

    By SelectStateAlabama = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div[2]/span/span[1]/span/ul/li[1]");
    public void clickOnTheSelectStateAlabama(){ driver.findElement(SelectStateAlabama).click();}

    By SelectStateGeorgia = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div[2]/span/span[1]/span/ul/li[2]");
    public void clickOnTheSelectStateGeorgia(){ driver.findElement(SelectStateGeorgia).click();}

    By SelectCountryWithDisabledValues = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div[2]/label");
    public void clickOnTheSelectCountryWithDisabledValues(){ driver.findElement(SelectCountryWithDisabledValues).click();}
    By TextBoxCountry2 = By.xpath("/html/body/span/span/span[1]/input");
    public void enterTextBoxCountry2(String arg3){driver.findElement(TextBoxCountry2).click();}

    By CountryGuam = By.xpath("//*[@id=\"select2-e03a-result-ec9u-GU\"]");
    public void clickOnTheSelectCountryGuam(){ driver.findElement(CountryGuam).click();}

    By Country = By.id("select2-06s7-container");
    public void clickOnTheCountry(){ driver.findElement(Country).click();}
    By SelectAFile = By.id("files");
    public void clickOnTheSelectAFile(){ driver.findElement(SelectAFile).click();}

    By FilePython = By.xpath("//*[@id=\"files\"]/optgroup[1]/option[2]");
    public void clickOnTheSelectFilePython(){ driver.findElement(FilePython).click();}

    By FileUnknownScript = By.xpath("//*[@id=\"files\"]/optgroup[3]/option[1]");
    public void clickOnTheSelectFileUnknownScript(){ driver.findElement(FileUnknownScript).click();}


}
