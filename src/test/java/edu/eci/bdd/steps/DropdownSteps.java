package edu.eci.bdd.steps;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import edu.eci.bdd.pages.DropdownPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DropdownSteps {

    WebDriver driver;
    DropdownPage dropdownPage;

    @Given("the user opens the dropdown page")
    public void openPage(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        dropdownPage = new DropdownPage(driver);
    }

    @When("the user selects {string}")
    public void selectOption(String option){
        dropdownPage.selectOption(option);
    }

    @Then("the dropdown should display {string}")
    public void verifyOption(String option){
        assertEquals(option, dropdownPage.getSelectedOption());
        driver.quit();
    }
}