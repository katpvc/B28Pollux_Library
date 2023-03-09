package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US49_LibraryPage {

    public US49_LibraryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[contains(@href, '#users')]")
    public WebElement usersBox;

    @FindBy (className = "sorting_desc")
    public WebElement userIdVerify;

    @FindBy(xpath = "//input [@type='search']")
    public WebElement searchBox;

   // @FindBy (xpath =  )
    //public WebElement userIdNumber;

    public String userIdNumber(String idNumber){
        return "//tbody//td[.='"+idNumber+"']";
    }


}
