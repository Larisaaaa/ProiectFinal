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
public class JQuerySelectDropdownPageTestCase extends BasePage{
    private JQuerySelectDropdownPage jQuerySelectDropdownPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        jQuerySelectDropdownPage = new JQuerySelectDropdownPage(driver);
}
}
