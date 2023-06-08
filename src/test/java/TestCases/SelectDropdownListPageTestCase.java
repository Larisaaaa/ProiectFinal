package TestCases;
import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SelectDropdownListPageTestCase extends BasePage {
    private SelectDropdownListPage selectDropdownListPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        selectDropdownListPage = new SelectDropdownListPage(driver);
    }

    @Test
    public void SelectDayCheckBox() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.clickOnTheSelectDayCheckBox();
        Assert.assertEquals("Day selected :- Tuesday", "Day selected :- Tuesday");
    }

    @Test
    public void MultipleSelectStateCheckBoxThenClickOnTheFirstSelectButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.clickOnTheMultipleSelectStateCheckBox();
        selectDropdownListPage.clickOnTheFirstSelectButton();
        Assert.assertEquals("First selected option is : California", "First selected option is : California");
    }

    @Test
    public void MultipleSelectStateCheckBoxThenClickOnTheGetAllSelectedButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.clickOnTheMultipleSelectStateCheckBox();
        selectDropdownListPage.clickOnTheGetAllSelectedButton();
        Assert.assertEquals("Last selected option is : Pennsylvania", "Last selected option is : Pennsylvania");
    }

    @Test
    public void MultipleSelectStateCheckBoxThenClickOnTheFirstSelectButtonAndClickOnTheGetAllSelectedButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.clickOnTheMultipleSelectStateCheckBox();
        selectDropdownListPage.clickOnTheFirstSelectButton();
        selectDropdownListPage.clickOnTheGetAllSelectedButton();
        Assert.assertEquals("First selected option is : New York", "First selected option is : New York");
        Assert.assertEquals("Last selected option is : New York", "Last selected option is : New York");

    }
}


