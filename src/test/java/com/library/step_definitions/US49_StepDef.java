package com.library.step_definitions;

import com.library.pages.US49_LibraryPage;
import com.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class US49_StepDef {

    US49_LibraryPage us49_libraryPage = new US49_LibraryPage();
    @When("User is on the Dashboard page")
    public void user_is_on_the_dashboard_page() {

    }
    @Then("User sees {string} next to Dashboard and Books")
    public void user_sees_next_to_dashboard_and_books(String string) {

       // BrowserUtils.verifyElementDisplayed(libraryPage.usersBox);

        System.out.println("libraryPage.usersBox.isDisplayed() = " + us49_libraryPage.usersBox.isDisplayed());



    }
    @Then("User clicks {string} button")
    public void user_clicks_button(String string) {

        us49_libraryPage.usersBox.click();
    }
    @Then("User sees {string}")
    public void user_sees(String string) {

        System.out.println("libraryPage.userIdVerify.isDisplayed() = " + us49_libraryPage.userIdVerify.isDisplayed());

    }
    @Then("User clicks {string}")
    public void user_clicks(String string) {
        us49_libraryPage.searchBox.click();
    }

    @Then("User types {string} in to the search box")
    public void user_types_in_to_the_search_box(String searchValue) {

        us49_libraryPage.searchBox.sendKeys(searchValue);

    }

    @Then("User sees {string} in the User Id column")
    public void user_sees_in_the_User_Id_column(String expectedUserId){

        String real1 = Driver.getDriver().findElement(By.xpath(us49_libraryPage.userIdNumber(expectedUserId))).getText();
        Assert.assertEquals(real1,expectedUserId);
        System.out.println("expected :" + expectedUserId + "\n actual: " + real1 + "\n\n");
        //System.out.println("libraryPage.userIdNumber.equals(expectedUserId) = " + libraryPage.userIdNumber.equals(expectedUserId));




    }





}
