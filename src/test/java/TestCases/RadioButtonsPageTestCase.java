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

  // @Test
     // public void clickOnTheMaleRadioButtonThenClickOnTheGetCheckedValueButton() throws InterruptedException {
     //  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
      // radioButtonsPage.clickOnTheMaleRadioButton();
      // radioButtonsPage.clickOnTheGetCheckedValueButton();
      // Assert.assertEquals("Radio button 'Male' is checked", "Radio button 'Male' is checked");
  // }

   @Test
    public void clickOnTheFemaleRadioButtonThenClickOnTheGetCheckedValueButton() throws InterruptedException {
       driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
       radioButtonsPage.clickOnTheFemaleRadioButton();
       radioButtonsPage.clickOnTheGetValuesButton();
       Assert.assertEquals("Radio button 'Female' is checked", "Radio button 'Female' is checked");
}
}




