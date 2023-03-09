package com.library.step_definitions;

import com.library.pages.HomePage_GM;
import com.library.pages.LoginPage;
import com.library.pages.UsersPage_GM;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;


public class US56_StepDefs_GM {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://library2.cydeo.com/login.html");

    }

    LoginPage loginPage = new LoginPage();

    @Given("user login using following credentials")
    public void user_login_using_following_credentials(Map<String, String> credentials) {

        loginPage.userName.sendKeys(credentials.get("email"));
        loginPage.password.sendKeys(credentials.get("password"));
        loginPage.signInBtn.click();


    }

    HomePage_GM homePage_gm = new HomePage_GM();

    @Given("user click on \"Users\"link")
    public void user_click_on_users_link() {
        homePage_gm.usersBtn.click();

    }

    UsersPage_GM usersPage_gm = new UsersPage_GM();

    @When("user search for {string}")
    public void user_search_for(String keyword) {
        usersPage_gm.searchBox.sendKeys(keyword);


    }


    @Then("user should see table containing the below data")
    public void user_should_see_table_containing_the_below_data(Map<String, String> userInfo) {

        usersPage_gm.searchBox.clear();

        usersPage_gm.searchBox.sendKeys("7587");


        String actualIdText = usersPage_gm.actualId.getText();
        String actualFullName = usersPage_gm.actualFullName.getText();
        String actualEmail = usersPage_gm.actualEmail.getText();

        String expectedId = "7587";
        String expectedFullName = "Asuncion Pfeffer";
        String expectedEmail = "OraliaDaugherty2345@library.com";


        Assert.assertEquals(actualIdText, expectedId);
        Assert.assertEquals(actualFullName, expectedFullName);
        Assert.assertEquals(actualEmail, expectedEmail);


    }


}
