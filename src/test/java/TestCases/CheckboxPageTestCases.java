package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.BasePage;
import Pages.CheckboxPage;
import Pages.SimpleFormPage;
public class CheckboxPageTestCases extends BasePage {
    private CheckboxPage checkboxPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkboxPage = new CheckboxPage(driver);
    }

    @Test
    public void clickOnTheSingleCheckboxCheckmark() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnSingleCheckbox();
        Assert.assertEquals("Success - Check box is checked", "Success - Check box is checked");
    }

    @Test
    public void clickOnTheFirstCheckBoxOption() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheFirstCheckboxOption();
    }

    @Test
    public void clickOnTheSecondCheckBoxOption() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheSecondCheckboxOption();
    }


    @Test
    public void multipleCheckboxDemo() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheFirstCheckboxOption();
        checkboxPage.clickOnTheSecondCheckboxOption();
    }


    @Test
    public void clickOnTheCheckAllButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheCheckAllButton();

    }

    @Test
    public void clickOnTheCheckAllButtonThenClickOnTheUncheckAllButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheCheckAllButton();
        checkboxPage.clickOnTheUncheckAllButton();
    }
}
