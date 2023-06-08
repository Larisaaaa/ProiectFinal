package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.SimpleFormPage;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import Pages.BasePage;
import org.testng.Assert;


public class SimpleFormTestCases extends BasePage {
    private SimpleFormPage simpleFormPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        simpleFormPage = new SimpleFormPage(driver);

    }
    @Test
    public void writeTextThenClickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("Test");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("Test"));
    }

    @Test
    public void writeTextInCapitalLettersThenClickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("TEST");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("TEST"));
    }

    @Test
    public void writeTextAndNumbersThenClickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("Test20");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("Test20"));
    }
    @Test
    public void writeNumbersThenClickOnTheGetCheckedValueButton() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("123");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("123"));
    }

    @Test
    public void writeSpecialCharactersThenClickOnTheGetCheckedValueButton() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("!?*:");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("!?*:"));
    }

    @Test
    public void writeTextNumbersAndSpecialCharactersThenClickOnTheGetCheckedValueButton() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("Test100!");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("Test100!"));
    }

    @Test
    public void writeTwoNumbersThenClickOnTheGetValuesButton()  throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.enterA("10");
        simpleFormPage.enterB("13");
        simpleFormPage.clickOnGetValuesButton();
        Assert.assertTrue(driver.getPageSource().contains("23"));
    }

    @Test
    public void writeLettersThenClickOnTheGetValuesButton()  throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.enterA("a");
        simpleFormPage.enterB("b");
        Assert.assertEquals("Entered value is not a number", "ab");
        //De ce imi da eroare?
    }


}


