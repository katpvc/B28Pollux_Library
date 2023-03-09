package com.library.pages;




import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);

        //
    }

    @FindBy(xpath = "//a[@class='navbar-brand']")
    private WebElement library_link;

    @FindBy(xpath = "//span[.='Books']/..")
    private WebElement booksLink;

    @FindBy(xpath = "//span[.='Borrowing Books']/..")
    private WebElement borrowBooksLink;

    @FindBy(xpath = "//span[.='Test Student 27']/..")
    private WebElement userLink;

    @FindBy(xpath = "//a[.='Log Out']")
    private WebElement logoutLink;


    public void navigateTo(String linkName){
       switch (linkName){
           case "Books":
               BrowserUtils.waitForClickablility(booksLink,3);
               booksLink.click();
               break;
           case "Borrowing Books":
               BrowserUtils.waitForClickablility(borrowBooksLink,3);
               break;
           case "Library":
               BrowserUtils.waitForClickablility(library_link,3);
               break;

       }
    }

    public void logout(){
        BrowserUtils.waitForClickablility(userLink,3);
        userLink.click();
        BrowserUtils.waitForClickablility(logoutLink,3);
        logoutLink.click();

    }


}
