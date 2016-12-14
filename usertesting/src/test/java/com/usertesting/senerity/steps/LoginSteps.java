package com.usertesting.senerity.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.usertesting.senerity.steps.serenity.EndUserSteps;

public class LoginSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Login page")
    public void givenTheUserIsOnTheLoginPage() { endUser.goto_the_login_page(); }

    @Given("the user is logged in")
    public void giventheUserIsLoggedIn(){
        endUser.login_if_is_not();
    }

    @When("the user is on the Dashboard page")
    public void GivenTheUserIsOnTheDasboardPage(){
        endUser.goto_the_dashboard_page();
    }

    @When("the user logs in with username '$username' and password '$password'")
    public void givenTheUserLogsInWith(String username, String password){
        endUser.login_with(username, password);
    }

    @Then("they should see the dashboard")
    public void thenTheyShouldSeeTheDashboard(){
        endUser.is_in_the_dashboard_page();
    }

    @Then("they should see the price '$price'")
    public void thenTheyShouldSeeThePrice(String price){
        endUser.can_see_the_price(price);
    }

}
