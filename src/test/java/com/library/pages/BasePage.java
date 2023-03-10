package com.library.pages;

import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }








    @FindBy(xpath = "//span[.='Borrowing Books']/..")
    public WebElement borrowBooksLink;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement userLink;

    //@FindBy (xpath = "//a[@id='navbarDropdown']/span")
    //public WebElement accountHolderName;

    @FindBy(xpath = "//a[.='Log Out']")
    public WebElement logoutLink;




    public void logout(){
        BrowserUtils.waitForClickablility(userLink,3);
        userLink.click();
        BrowserUtils.waitForClickablility(logoutLink,3);
        logoutLink.click();

    }



}



