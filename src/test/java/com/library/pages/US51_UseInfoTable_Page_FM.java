package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US51_UseInfoTable_Page_FM {

    public US51_UseInfoTable_Page_FM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Users']")
    public WebElement userLink;

    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement element50;


    @FindBy(xpath = "//select/option[4]")
    public WebElement shows50;
}
