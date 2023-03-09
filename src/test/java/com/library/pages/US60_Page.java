package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US60_Page {

    public US60_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Users")
    public WebElement usersLink;

    @FindBy(linkText = "Books")
    public WebElement booksLink;

    @FindBy(linkText = "Dashboard")
    public WebElement dashboardLink;

}
