package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage_GM {

    public UsersPage_GM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//td[.='7587']")
    public WebElement actualId;

    @FindBy(xpath = "//td[.='Asuncion Pfeffer']")
    public WebElement actualFullName;

    @FindBy (xpath = "//td[.='OraliaDaugherty2345@library.com']")
    public WebElement actualEmail;




}
