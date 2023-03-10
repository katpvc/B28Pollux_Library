package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US54_LoginValidCredentials_KatPage {
    public US54_LoginValidCredentials_KatPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement accountHolderName;


}
