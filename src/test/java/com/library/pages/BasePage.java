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

    @FindBy(xpath = "//a[@class='navbar-brand']")




    private WebElement library_link;

    @FindBy(xpath = "//span[.='Books']/..")
    private WebElement booksLink;

    @FindBy(xpath = "//span[.='Borrowing Books']/..")
    private WebElement borrowBooksLink;











}
