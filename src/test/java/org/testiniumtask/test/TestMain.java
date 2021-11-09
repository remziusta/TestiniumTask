package org.testiniumtask.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testiniumtask.base.BaseTest;
import org.testiniumtask.page.CartProcess;
import org.testiniumtask.page.LoginPage;
import org.testiniumtask.page.SearchAndAddCartItemProcess;

public class TestMain extends BaseTest {
    SearchAndAddCartItemProcess searchAndAddCartItemProcess;
    LoginPage loginPage;
    CartProcess cartProcess;

    @Before
    public void before() {
        searchAndAddCartItemProcess = new SearchAndAddCartItemProcess(getWebDriver());
        loginPage = new LoginPage(getWebDriver());
        cartProcess = new CartProcess(getWebDriver());
    }

    @Test
    public void test() {
        //Login Test
        loginPage
                .moveToLogIn()
                .clickLogIn()
                .sendEmail()
                .sendPassword()
                .submitButton();

        //Search And Scroll Down Page Test
        searchAndAddCartItemProcess
                .sendSearchWord()
                .moveToSearchButton()
                .clickSearchButton()
                .scrollDownPage()
                .clickMoreProduct()
                .moveToProduct()
                .clickProduct()
                .selectSize()
                .addToCard()
                .moveToGoToCardButton()
                .clickGoToCardButton();

        //Card Control Test
        cartProcess
                .controllPrice()
                .moveToPlusButton()
                .clickPlusButton()
                .controlCount()
                .moveEmptyButton()
                .clickEmptyButton()
                .clickModelDeleteButton();
    }

    @After
    public void after() {

    }
}
