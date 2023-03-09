package com.library.step_definitions;

import com.library.pages.US51_UseInfoTable_Page_FM;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class US51_UserInfoTable_StepsDef {

    US51_UseInfoTable_Page_FM us51_useInfoTable_pageFM = new US51_UseInfoTable_Page_FM();

    @And("I click on {string} link")
    public void iClickOnLink(String user) {

        us51_useInfoTable_pageFM.userLink.click();
    }

    @When("I select Show {int} records")
    public void iSelectShowRecords(int records_50) {

        Select select = new Select(us51_useInfoTable_pageFM.element50);
        select.selectByValue("50");
    }

    @Then("show records value should be {int}")
    public void showRecordsValueShouldBe(int value50) {

        int actual = Integer.parseInt(String.valueOf(Driver.getDriver().findElement(By.xpath("//select/option[4]")).getText()));

        int expected = 50;

        Assert.assertEquals(actual, expected);

    }

    @And("the users table must display {int} records")
    public void theUsersTableMustDisplayRecords(int arg0) {
    }
}
