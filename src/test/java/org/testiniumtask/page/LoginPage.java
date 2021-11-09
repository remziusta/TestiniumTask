package org.testiniumtask.page;

import org.openqa.selenium.WebDriver;
import org.testiniumtask.base.BasePage;

import static org.testiniumtask.constants.Constans.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage moveToLogIn(){
        hoverElement(MOVE);
        return this;
    }

    public LoginPage clickLogIn(){
        click(MOVE);
        return this;
    }

    public LoginPage sendEmail(){
        sendKeys(TX_MAIL,"testmail2@gmail.com");
        return this;
    }

    public LoginPage sendPassword(){
        sendKeys(TX_PASSWORD,"test123");
        return this;
    }

    public LoginPage submitButton(){
        click(BTN_LOGIN);
        return this;
    }


}
