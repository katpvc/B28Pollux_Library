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

    @FindBy(xpath = "//a[@class='navbar-brand']")

    public WebElement library_link;


    @FindBy(xpath = "//span[normalize-space()=\"Users\"]")
    public WebElement userName;

    @FindBy(xpath = "//span[.='Books']/..")
    public WebElement booksLink;


    @FindBy(xpath = "//span[.='Borrowing Books']/..")
    public WebElement borrowBooksLink;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement userLink;

    //@FindBy (xpath = "//a[@id='navbarDropdown']/span")
    //public WebElement accountHolderName;

    @FindBy(xpath = "//a[.='Log Out']")
    public WebElement logoutLink;


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


    public WebElement getElement() {  // this method prevents StaleElementReferenceException by relocating the same element
        try {
            return new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//table//tr//td)[4]")));
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            return new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//table//tr//td)[4]")));
        }
    }




}



