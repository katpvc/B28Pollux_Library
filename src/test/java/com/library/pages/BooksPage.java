package com.library.pages;

import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.LinkedHashMap;
import java.util.Map;

public class BooksPage extends BasePage{

    public BooksPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@type='search']")
    private WebElement search;

    @FindBy(xpath = "//table[@id='tbl_books']//tbody//td[2]")
    private WebElement isbn;

    @FindBy(xpath = "//table[@id='tbl_books']//tbody//td[3]")
    private WebElement name;

    @FindBy(xpath = "//table[@id='tbl_books']//tbody//td[4]")
    private WebElement author;

    @FindBy(xpath = "//table[@id='tbl_books']//tbody//td[5]")
    private WebElement category;

    @FindBy(xpath = "//table[@id='tbl_books']//tbody//td[6]")
    private WebElement year;

    @FindBy(xpath = "//table[@id='tbl_books']//tbody//td[7]")
    private WebElement borrowedBy;
    public void searchFor(String input){
        search.sendKeys(input);
    }

    public Map<String,String> getValuesAsMap(){
        Map<String,String> result = new LinkedHashMap<>();
        result.put("ISBN",isbn.getText());
        result.put("Name",name.getText());
        result.put("Author",author.getText());
        result.put("Category",category.getText());
        result.put("Year",year.getText());
        return result;
    }
    @FindBy(xpath = "//span[.='Test Student 27']/..")
    private WebElement userLink;

    @FindBy(xpath = "//span[.='Books']/..")
    private WebElement booksLink;

    @FindBy(xpath = "//span[.='Borrowing Books']/..")
    private WebElement borrowBooksLink;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    private WebElement library_link;
    public void logout(){
        BrowserUtils.waitForClickablility(userLink,3);
        userLink.click();
     /*   BrowserUtils.waitForClickablility(logoutLink,3);
        logoutLink.click();

      */


    }
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


}
