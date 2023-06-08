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

public class RadioButtonsPageTestCase extends BasePage{
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
       //De ce imi da eroare?
   }

   @Test
    public void clickOnTheFemaleRadioButtonThenClickOnTheGetCheckedValueButton() throws InterruptedException {
       driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
       radioButtonsPage.clickOnTheFemaleRadioButton();
       radioButtonsPage.clickOnTheGetValuesButton();
       Assert.assertEquals("Radio button 'Female' is checked", "Radio button 'Female' is checked");
       //De ce imi da eroare?
}
    @Test
    public void clickOnTheGenderMaleOption() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheGenderMaleOption();
        radioButtonsPage.clickOnTheGetValuesButton();
        Assert.assertEquals("Gender : Male", "Gender : Male");
    }

    @Test
    public void clickOnTheAge15to50CheckboxThenClickOnTheGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheAge15to50Checkbox ();
        radioButtonsPage.clickOnTheGetValuesButton();
        Assert.assertEquals("Age Group : 15 - 50", "Age Group : 15 - 50");
    }

    //TEST GENDER+AGE

    @Test
    public void clickOnTheCheckBox1() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheCheckBox1();
    }

    @Test
    public void clickOnTheCheckBox2() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonsPage.clickOnTheCheckBox2();
    }
}




