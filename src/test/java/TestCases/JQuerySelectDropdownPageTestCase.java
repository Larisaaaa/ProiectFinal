package TestCases;
import Pages.CheckboxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.BasePage;
import Pages.JQuerySelectDropdownPage;
import Pages.SimpleFormPage;
public class JQuerySelectDropdownPageTestCase extends BasePage {
    private JQuerySelectDropdownPage jQuerySelectDropdownPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        jQuerySelectDropdownPage = new JQuerySelectDropdownPage(driver);
    }

    @Test
    public void clickOnTheSelectCountryCheckBoxAndWriteInTheTextBoxCountry() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jQuerySelectDropdownPage.clickOnTheSelectCountryCheckBox();
        jQuerySelectDropdownPage.enterTextBox("Australia");
        Assert.assertTrue(driver.getPageSource().contains("Australia"));
    }

    @Test
    public void clickOnTheSelectCountryCheckBoxAndSelectCountryIndia() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jQuerySelectDropdownPage.clickOnTheSelectCountryCheckBox();
        jQuerySelectDropdownPage.clickOnTheSelectCountryIndia();
        Assert.assertTrue(driver.getPageSource().contains("India"));

    }

    @Test
    public void clickOnTheMultipleStatesCheckBoxAndSelectStateAlabama() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jQuerySelectDropdownPage.clickOnTheSelectMultipleStatesCheckBox();
        jQuerySelectDropdownPage.clickOnTheSelectStateAlabama();
        Assert.assertTrue(driver.getPageSource().contains("Alabama"));
    }
//TEST CU 3 STATE

    @Test
    public void clickOnTheTheSelectCountryWithDisabledValuesAndWriteInTheTextBox() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jQuerySelectDropdownPage.clickOnTheSelectCountryWithDisabledValues();
        jQuerySelectDropdownPage.enterTextBoxCountry2("Puerto Rico");
        Assert.assertTrue(driver.getPageSource().contains("Puerto Rico"));
        //De ce imi da eroare?
    }

    @Test
    public void clickOnTheTheSelectCountryWithDisabledValuesAndClickOnTheSelectCountryGuam() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
        jQuerySelectDropdownPage.clickOnTheSelectCountryWithDisabledValues();
        jQuerySelectDropdownPage.clickOnTheSelectCountryGuam();
        //Cum sa scriu ca NU se poate selecta tara Guam?


        @Test
        public void clickOnTheSelectAFileAndSelectFilePython () throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
            jQuerySelectDropdownPage.clickOnTheSelectAFile();
            jQuerySelectDropdownPage.clickOnTheSelectFilePython();
            Assert.assertEquals("Python", "Python");
        }

        @Test
        public void clickOnTheSelectAFileAndSelectFileUnknownScript () throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[7]/a")).click();
            jQuerySelectDropdownPage.clickOnTheSelectAFile();
            jQuerySelectDropdownPage.clickOnTheSelectFileUnknownScript();
            Assert.assertEquals("Unknown Script", "Unknown Script");

        }
    }
}