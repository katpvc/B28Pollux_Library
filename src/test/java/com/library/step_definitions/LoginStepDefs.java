package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
public class LoginStepDefs {


    LoginPage loginPage = new LoginPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if (userType.equalsIgnoreCase("student")) {
            username = ConfigurationReader.getProperty("student_username");
            password = ConfigurationReader.getProperty("student_password");
        } else if (userType.equalsIgnoreCase("librarian")) {
            username = ConfigurationReader.getProperty("librarian_username");
            password = ConfigurationReader.getProperty("librarian_password");
        }
        //send username and password and login
        new LoginPage().login(username, password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }





}
