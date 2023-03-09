package com.library.step_definitions;

import com.library.pages.UserManagementPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US05_userPageSearch_stepDef {

    UserManagementPage userManagementPage = new UserManagementPage();


    @Given("user click on Users link")
    public void user_click_on_link() {

        userManagementPage.userName.click();

    }
    @When("user search for {string}")
    public void user_search_for(String string) {
        userManagementPage.searchBox.sendKeys(string);
    }
    @Then("table should contain rows with {string}")
    public void table_should_contain_rows_with(String string) {

        userManagementPage.getElement();
        Assert.assertTrue(userManagementPage.tableRow.getText().startsWith(string));
    }

    @Then("table should have following column names")
    public void tableShouldHaveFollowingColumnNames(List<String>expectedNames) {

        List<String> actualNames = new ArrayList<>();

        for (WebElement each : userManagementPage.dataTableTitles) {
            actualNames.add(each.getText());
        }

        Assert.assertEquals(expectedNames,actualNames);

    }
}
