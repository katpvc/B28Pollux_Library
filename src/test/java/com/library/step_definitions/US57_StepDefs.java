package com.library.step_definitions;

import com.library.pages.BooksPage;
import com.library.pages.LoginPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class US57_StepDefs{
    BooksPage booksPage = new BooksPage();
    @Given("I login to application as a student")
    public void iLoginToApplicationAsAStudent() {
        LoginPage loginPage=new LoginPage();
        String username= ConfigurationReader.getProperty("student_username");
        String password= ConfigurationReader.getProperty("student_password");
        loginPage.login(username,password);

    }

    @And("I navigate to {string} page")
    public void iNavigateToPage(String linkName) {

        booksPage.navigateTo(linkName);
    }

    @And("I search for {string}")
    public void iSearchFor(String searchText) {
        booksPage.searchFor(searchText);
    }


    @Then("books table should contain results matching")
    public void booksTableShouldContainResultsMatchingTheGoldfinch(Map<String, String> info) {
        BrowserUtils.sleep(1);
        Assert.assertEquals(booksPage.getValuesAsMap(), info);
    }
}
