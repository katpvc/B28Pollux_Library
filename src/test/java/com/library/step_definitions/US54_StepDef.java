package com.library.step_definitions;

import com.library.pages.BasePage;
import com.library.pages.LoginPage;
import com.library.pages.US54_LoginValidCredentials_KatPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US54_StepDef extends BasePage {
    LoginPage loginPage = new LoginPage();
    US54_LoginValidCredentials_KatPage us54_page = new US54_LoginValidCredentials_KatPage();


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User login using {string} and {string}")
    public void user_login_using_and(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String name) {
        BrowserUtils.sleep(2);
        String actualName = us54_page.accountHolderName.getText();
        Assert.assertEquals(actualName, name);
        //System.out.println(actualName+ " A N");
       // System.out.println(name);
    }


}