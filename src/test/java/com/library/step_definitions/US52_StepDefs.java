package com.library.step_definitions;

import com.library.pages.US52_NumberOfRowsPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Optional;


public class US52_StepDefs {

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        System.out.println("Login to app in Before method");
    }


    US52_NumberOfRowsPage us52_numberOfRowsPage = new US52_NumberOfRowsPage();

    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        us52_numberOfRowsPage.userNameBox.sendKeys(ConfigurationReader.getProperty("librarian_username"));
        us52_numberOfRowsPage.passwordBox.sendKeys(ConfigurationReader.getProperty("librarian_password"));
        us52_numberOfRowsPage.signInButton.click();
    }

    @Given("I click on Users link")
    public void i_click_on_users_link() {
        us52_numberOfRowsPage.UserButton.click();
    }

    @When("I select Show {string} records")
    public void i_select_show_records(String string) {
        Select select = new Select(us52_numberOfRowsPage.showButton);
        List<WebElement> actualNumbersWebElements = select.getOptions();
        for (WebElement each : actualNumbersWebElements) {
            if (each.getText().equals(string)) {
                each.click();
            }
        }
    }

    @Then("show records value should be {string}")
    public void show_records_value_should_be(String string) {
        Select select = new Select(us52_numberOfRowsPage.showButton);
        String actualValue = select.getFirstSelectedOption().getText();
        Assert.assertEquals(actualValue, string);
    }

    @Then("the users table must display {string} records")
    public void the_users_table_must_display_records(String numberOfRows) {
        int actualSize = us52_numberOfRowsPage.rows.size();
        String stingActualSize = "" + actualSize;

        Assert.assertEquals(stingActualSize, numberOfRows);

    }

}
