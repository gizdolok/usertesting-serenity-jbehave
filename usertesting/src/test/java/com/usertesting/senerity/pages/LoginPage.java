package com.usertesting.senerity.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by daniel.kolodzig on 14/09/16.
 */
@DefaultUrl("https://www.usertesting.com/users/sign_in")
public class LoginPage extends PageObject {
    //Locators
    //Login Form
    @FindBy(css = "#sign-in-form>saml-detection")
    private WebElement loginFormElement;

    //UserName inputText
    @FindBy(id = "user_email")
    private WebElement userNameElement;

    //Password inputText
    @FindBy(id = "user_password")
    private WebElement passwordElement;

    @FindBy(css = "input[name='commit']")
    private WebElement loginButtonElement;

    /*public LoginPage(WebDriver driver) {
        super(driver);
    }*/


    public void goTo() {}

    public boolean isAt() {return true;}

    public LoginCommand as(String userName)
    {
        return new LoginCommand(userName);
    }

    public class LoginCommand
    {
        private String userName;
        private String password;

        public LoginCommand(String userName)
        {
            this.userName = userName;
        }

        public void withPassword(String password)
        {
            this.password = password;
            login();
        }

        private void login()
        {
            userNameElement.sendKeys(userName);
            passwordElement.sendKeys(password);
            loginButtonElement.click();
        }
    }
}
