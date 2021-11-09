package org.testiniumtask.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testiniumtask.base.BasePage;

import java.util.Arrays;

import static org.testiniumtask.constants.Constans.*;

public class SearchAndAddCartItemProcess extends BasePage {

    public SearchAndAddCartItemProcess(WebDriver driver) {
        super(driver);
    }

    public SearchAndAddCartItemProcess sendSearchWord() {
        sendKeys(TX_SEARCH, "Pantolon");
        return this;
    }

    public SearchAndAddCartItemProcess moveToSearchButton() {
        hoverElement(BTN_SEARCH);
        return this;
    }

    public SearchAndAddCartItemProcess clickSearchButton() {
        click(BTN_SEARCH);
        return this;
    }

    public SearchAndAddCartItemProcess scrollDownPage() {
        scrollDown();
        return this;
    }

    public SearchAndAddCartItemProcess clickMoreProduct() {
        click(BTN_LOAD_MORE_PRODUCT);
        return this;
    }

    public SearchAndAddCartItemProcess moveToProduct() {
        hoverElement(SELECTED_PRODUCT);
        return this;
    }

    public SearchAndAddCartItemProcess clickProduct() {
        click(SELECTED_PRODUCT);
        return this;
    }

    public SearchAndAddCartItemProcess selectSize() {
        hoverElement(BTN_SIZE);
        click(BTN_SIZE);
        return this;
    }

    public SearchAndAddCartItemProcess addToCard() {
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
        hoverElement(BTN_GO_TO_CARD);
        return this;
    }

    public void clickGoToCardButton() {
        click(BTN_GO_TO_CARD);
    }
}
