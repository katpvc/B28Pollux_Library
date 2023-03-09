package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagement_GM {

    public UserManagement_GM(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//td[normalize-space()='7587']")
    public WebElement actualId;

    @FindBy(xpath = "//td[normalize-space()='Asuncion Pfeffer']")
    public WebElement actualFullName;

    @FindBy (xpath = "//td[normalize-space()='OraliaDaugherty2345@library.com']")
    public WebElement actualEmail;

}
