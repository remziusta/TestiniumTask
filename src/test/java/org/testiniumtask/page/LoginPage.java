package org.testiniumtask.page;

import org.openqa.selenium.WebDriver;
import org.testiniumtask.base.BasePage;

import java.util.logging.Logger;

import static org.testiniumtask.constants.Constans.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private final static Logger logger = Logger.getLogger(String.valueOf(LoginPage.class));

    public LoginPage moveToLogIn(){
        logger.info("On the login page button");
        hoverElement(MOVE);
        return this;
    }

    public LoginPage clickLogIn(){
        logger.info("Click the login page button");
        click(MOVE);
        return this;
    }

    public LoginPage sendEmail(){
        logger.info("Email value sent");
        sendKeys(TX_MAIL,"testmail2@gmail.com");
        return this;
    }

    public LoginPage sendPassword(){
        logger.info("Password value sent");
        sendKeys(TX_PASSWORD,"test123");
        return this;
    }

    public LoginPage submitButton(){
        logger.info("Click the login button");
        click(BTN_LOGIN);
        return this;
    }


}
