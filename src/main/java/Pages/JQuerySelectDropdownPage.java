package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class JQuerySelectDropdownPage extends BasePage  {
    public JQuerySelectDropdownPage(WebDriver driver){
        super(driver);
    }

    //Locators for Single Select - Search and Select country
    By SelectSingleCountry = By.id("select2-country-container");


    //Locators for Multi Select - Search and Select multiple states
    By SelectMultipleStates = By.className("select2-search__field");

    By SelectCountry = By.id("select2-elfb-container");
    By Country = By.id("select2-06s7-container");
    By SelectAFile = By.id("files");

}
