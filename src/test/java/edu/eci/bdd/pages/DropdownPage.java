package edu.eci.bdd.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    WebDriver driver;

    public DropdownPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="dropdown")
    WebElement dropdown;

    public void selectOption(String option){
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
    }

    public String getSelectedOption(){
        Select select = new Select(dropdown);
        return select.getFirstSelectedOption().getText();
    }
}
