package com.usertesting.senerity.steps.serenity;

import com.usertesting.senerity.pages.DashboardPage;
import com.usertesting.senerity.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps extends ScenarioSteps {

    LoginPage login;
    DashboardPage dashboard;

    //@Step
    //public void should_see_definition(String definition) {
        //assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    //}

    @Step
    public void goto_the_login_page() {
        login.open();
    }

    @Step
    public void is_in_the_login_page() {
        login.open();
    }

    @Step
    public void login_with(String username, String password) {
        login.as(username).withPassword(password);
    }

    @Step
    public void is_in_the_dashboard_page() {
        assertThat("user is not on the dashboard",  dashboard.isAt().equals(true));
    }

    @Step
    public void goto_the_dashboard_page() {
        dashboard.open();
    }

    @Step
    public void login_if_is_not() {
        Boolean isAtAny = dashboard.isAt();// ||
        if (!isAtAny){
            goto_the_login_page();
            login_with("droidzig+usertesting@gmail.com", "aA123456");
            is_in_the_dashboard_page();
        }
    }

    @Step
    public void can_see_the_price(String price) {
        //header.
    }
}