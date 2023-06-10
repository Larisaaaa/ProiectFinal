package TestCases;
import Pages.CheckboxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.BasePage;
import Pages.RadioButtonsPage;
import Pages.SimpleFormPage;

public class RadioButtonsPageTestCase extends BasePage {
    private RadioButtonsPage radioButtonsPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        radioButtonsPage = new RadioButtonsPage(driver);
    }

    @Test
    public void clickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheGetCheckedValueButton();
        Assert.assertEquals("Radio button is Not checked", "Radio button is Not checked");
    }

    @Test
    public void clickOnTheMaleRadioButtonThenClickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheMaleRadioButton();
        radioButtonsPage.clickOnTheGetCheckedValueButton();
        Assert.assertEquals("Radio button 'Male' is checked", "Radio button 'Male' is checked");

    }

    @Test
    public void clickOnTheFemaleRadioButtonThenClickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheFemaleRadioButton();
        radioButtonsPage.clickOnTheGetValuesButton();
        Assert.assertEquals("Radio button 'Female' is checked", "Radio button 'Female' is checked");
    }

    @Test
    public void clickOnTheGenderMaleOptionThenClickOnTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheGenderMaleOption();
        radioButtonsPage.clickOnTheGetValuesButton();
        Assert.assertEquals("Gender : Male", "Gender : Male");
    }

    @Test
    public void clickOnTheGenderFemaleOptionThenClickOnTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheGenderFemaleCheckbox();
        radioButtonsPage.clickOnTheGetValuesButton();
        Assert.assertEquals("Gender : Female", "Gender : Female");

    }

    @Test
    public void clickOnTheGenderOtherOptionThenClickOnTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheGenderOtherCheckBox();
        radioButtonsPage.clickOnTheGetValuesButton();
        Assert.assertEquals("Gender : Other", "Gender : Other");
    }


    @Test
    public void clickOnTheAge0to5CheckboxThenClickOnTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheAge0to5Checkbox();
        radioButtonsPage.clickOnTheGetValuesButton();
        Assert.assertEquals("Age : 0 - 5", "Age : 0 - 5");
    }

    @Test
    public void clickOnTheAge5to15CheckboxThenClickOnTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheAge5to15Checkbox();
        radioButtonsPage.clickOnTheGetValuesButton();
        Assert.assertEquals("Age : 5 - 15", "Age : 5 - 15");
    }

    @Test
    public void clickOnTheAge15to50CheckboxThenClickOnTheGetValuesButton () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheAge15to50Checkbox();
        radioButtonsPage.clickOnTheGetValuesButton();
        Assert.assertEquals("Age : 15 - 50", "Age : 15 - 50");
    }
    @Test
    public void clickOnTheGenderFemaleOptionAndClickOnTheAge15to50CheckboxThenClickOnTheGetValuesButton () throws
            InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheGenderFemaleCheckbox();
        radioButtonsPage.clickOnTheAge15to50Checkbox();
        radioButtonsPage.clickOnTheGetValuesButton();
        Assert.assertEquals("Gender : Female, Age : 5 - 15", "Gender : Female, Age : 5 - 15");
    }

    @Test
    public void clickOnTheCheckBox1 () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheCheckBox1();
        Assert.assertEquals("Checkbox1 should be selected", "Checkbox1 should be selected");
    }

    @Test
    public void clickOnTheCheckBox2 () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheCheckBox2();
        Assert.assertEquals("Checkbox2 should be selected", "Checkbox2 should be selected");
    }
}





