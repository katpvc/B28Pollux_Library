package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserManagementPage extends BasePage{

    public UserManagementPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement searchBox;

    @FindBy(xpath = "(//table//tr//td)[4]")
    public WebElement tableRow;

    @FindBy(xpath = "//th")
    public List <WebElement> dataTableTitles;



    }


