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
    public void clickOnTheFirstCheckBox() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheCheckbox1();
        Assert.assertEquals("Checkbox1 should be selected", "Checkbox1 should be selected");
    }

    @Test
    public void clickOnTheSecondCheckBox() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheCheckbox2();
        Assert.assertEquals("Checkbox2 should be selected", "Checkbox2 should be selected");
    }

    @Test
    public void clickOnTheDisabledCheckbox() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheDisabledCheckbox();
        Assert.assertEquals("Disabled checkbox should not be selected", "Disabled checkbox should not be selected");
    }

    @Test
    public void TwoSelectMultipleCheckboxDemo() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheOption1();
        checkboxPage.clickOnTheOption2();
        Assert.assertEquals("Option1 and Option2 should be selected", "Option1 and Option2 should be selected");
    }

    @Test
    public void clickOnTheMultipleCheckboxDemo() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheOption1();
        checkboxPage.clickOnTheOption2();
        checkboxPage.clickOnTheOption3();
        checkboxPage.clickOnTheOption4();
        Assert.assertEquals("All option should be selected", "All option should be selected");
    }

    @Test
    public void clickOnTheCheckAllButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheCheckAllButton();
        Assert.assertEquals("All checkboxes should be checked", "All checkboxes should be checked");
    }

    @Test
    public void clickOnTheCheckAllButtonThenClickOnTheUncheckAllButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheCheckAllButton();
        checkboxPage.clickOnTheUncheckAllButton();
        Assert.assertEquals("All checkboxes should be unchecked", "All checkboxes should be unchecked");
    }
}
