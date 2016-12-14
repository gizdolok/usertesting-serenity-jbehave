package com.usertesting.senerity.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by kolod on 13/12/2016.
 */
@DefaultUrl("https://www.usertesting.com/dashboard")
public class DashboardPage extends PageObject {
    public Boolean isAt() {
        return true;
    }
}
