package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US52_NumberOfRowsPage {

    public US52_NumberOfRowsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "inputEmail")
    public WebElement userNameBox;

    @FindBy(id = "inputPassword")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement UserButton;

    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement showButton;


    @FindBy(xpath = "//option[@value='count']")
    public WebElement dropDownOptions;

    @FindBys(
    @FindBy (xpath = "//tbody/tr"))
    public List<WebElement> rows;




}
