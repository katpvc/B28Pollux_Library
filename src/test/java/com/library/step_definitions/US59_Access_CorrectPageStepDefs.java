package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US59_Access_CorrectPageStepDefs {


    LoginPage loginPage=new LoginPage(); //the url opening

    @When("user enters librarian username{string}")
    public void userEntersLibrarianUsername(String arg0) {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("librarian12_username"));


    }


    @And("user enter librarian password{string}")
    public void userEnterLibrarianPassword(String arg0) {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("librarian12_password"));

    }

    @When("user enters student username{string}")
    public void userEntersStudentUsername(String arg0) {

         loginPage.userName.sendKeys(ConfigurationReader.getProperty("student12_username"));

    }


    @And("user enter  student password{string}")
    public void userEnterStudentPassword(String arg0) {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("student12_password"));

    }




    @Then("user should see the dashboard")
    public void userShouldSeeTheDashboard() {
        System.out.println("Now User See the DashBoard Page.");
        System.out.println("Now User See the student Book Management Page");
    }

}


