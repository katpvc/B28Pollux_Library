package com.library.step_definitions;

import com.library.pages.BasePage;
import com.library.pages.LoginPage;
import com.library.pages.US60_Page;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US60_StepDefs {

    LoginPage loginPage = new LoginPage();
    US60_Page us60Page = new US60_Page();

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @And("I login as a librarian")
    public void iLoginAsALibrarian() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("librarian_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("librarian_password"));
        loginPage.signInBtn.click();
    }

    @When("I click on {string} module")
    public void iClickOnModule(String arg0) {

        if (arg0.equalsIgnoreCase("Users")) {
            //usersLink.click();
            us60Page.usersLink.click();
        }else if (arg0.equalsIgnoreCase("Books")) {
           // booksLink.click();
            us60Page.booksLink.click();
        }else if (arg0.equalsIgnoreCase("Dashboard")){
            // dashboardLink.click();
            us60Page.usersLink.click();
        }

    }


    @Then("{string} page should be displayed")
    public void pageShouldBeDisplayed(String arg0) {

        if (arg0.equalsIgnoreCase("Users")){
            BrowserUtils.verifyURLContains("users");
        } else if (arg0.equalsIgnoreCase("Books")) {
            BrowserUtils.verifyURLContains("books");
        } else if (arg0.equalsIgnoreCase("Dashboard")) {
            BrowserUtils.verifyURLContains("dashboard");
        }

    }

    @When("I click on {string} link")
    public void iClickOnLink(String arg0) {
        us60Page.booksLink.click();
        us60Page.dashboardLink.click();
    }



}
