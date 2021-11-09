package org.testiniumtask.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testiniumtask.base.BasePage;

import java.util.Arrays;
import java.util.logging.Logger;

import static org.testiniumtask.constants.Constans.*;

public class SearchAndAddCartItemProcess extends BasePage {

    public SearchAndAddCartItemProcess(WebDriver driver) {
        super(driver);
    }
    private final static Logger logger = Logger.getLogger(String.valueOf(SearchAndAddCartItemProcess.class));

    public SearchAndAddCartItemProcess sendSearchWord() {
        logger.info("The value to be searched has been sent\n");
        sendKeys(TX_SEARCH, "Pantolon");
        return this;
    }

    public SearchAndAddCartItemProcess moveToSearchButton() {
        logger.info("On the search button");
        hoverElement(BTN_SEARCH);
        return this;
    }

    public SearchAndAddCartItemProcess clickSearchButton() {
        logger.info("Click the search button");
        click(BTN_SEARCH);
        return this;
    }

    public SearchAndAddCartItemProcess scrollDownPage() {
        logger.info("Scroll down page");
        scrollDown();
        return this;
    }

    public SearchAndAddCartItemProcess clickMoreProduct() {
        logger.info("Click the See More Product button");
        click(BTN_LOAD_MORE_PRODUCT);
        return this;
    }

    public SearchAndAddCartItemProcess moveToProduct() {
        logger.info("On the product");
        hoverElement(SELECTED_PRODUCT);
        return this;
    }

    public SearchAndAddCartItemProcess clickProduct() {
        logger.info("Click the product");
        click(SELECTED_PRODUCT);
        return this;
    }

    public SearchAndAddCartItemProcess selectSize() {
        logger.info("Select the product size and height");
        hoverElement(BTN_SIZE);
        click(BTN_SIZE);
        return this;
    }

    public SearchAndAddCartItemProcess addToCard() {
        logger.info("Product Add to Card.");
        String[] singles = findElement(TX_PRODUCT_SINGLE_PRICE).getAttribute("innerText").split(" ");
        String[] discounts = findElement(TX_PRODUCT_DISCOUNT_PRICE).getAttribute("innerText").split(" ");
        if (singles.length > 0 || discounts.length > 0) {
            PRODUCT_SINGLE_PRICE = Double.valueOf(singles[0].replace(',', '.'));
            PRODUCT_DISCOUNT_PRICE = Double.valueOf(discounts[0].replace(',', '.'));
        }
        click(BTN_ADD_TO_CARD);
        return this;
    }

    public SearchAndAddCartItemProcess moveToGoToCardButton() {
        logger.info("On the go to card button");
        hoverElement(BTN_GO_TO_CARD);
        return this;
    }

    public void clickGoToCardButton() {
        logger.info("Click the go to card button");
        click(BTN_GO_TO_CARD);
    }
}
