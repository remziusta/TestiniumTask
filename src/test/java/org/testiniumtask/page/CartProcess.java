package org.testiniumtask.page;

import org.openqa.selenium.WebDriver;
import org.testiniumtask.base.BasePage;

import java.util.logging.Logger;

import static org.testiniumtask.constants.Constans.*;

public class CartProcess extends BasePage {

    public CartProcess(WebDriver driver) {
        super(driver);
    }
    private final static Logger logger = Logger.getLogger(String.valueOf(CartProcess.class));

    public CartProcess controllPrice() {
        logger.info("Comparing product prices");
        String[] cardItemPrices = findElement(TX_CARD_PRODUCT_ITEM_PRICE).getAttribute("innerText").split(" ");
        Double cardItemPrice = Double.valueOf(cardItemPrices[0].replace(',', '.'));
        if (PRODUCT_SINGLE_PRICE != null && PRODUCT_DISCOUNT_PRICE != null) {
            if (PRODUCT_DISCOUNT_PRICE.equals(cardItemPrice)) {
                logger.info("Product prices are equal\n");
            } else {
                logger.info("Product prices are not equal\n");
            }
        } else if (PRODUCT_DISCOUNT_PRICE == null) {
            assert PRODUCT_SINGLE_PRICE != null;
            if (PRODUCT_SINGLE_PRICE.equals(cardItemPrice)) {
                logger.info("Product prices are equal\n");
            } else {
                logger.info("Product prices are not equal\n");
            }
        }

        return this;
    }

    public CartProcess moveToPlusButton(){
        logger.info("On the plus button");
        hoverElement(BT_PLUS);
        return this;
    }

    public CartProcess clickPlusButton(){
        logger.info("Click the search button");
        click(BT_PLUS);
        return this;
    }

    public CartProcess controlCount(){
        logger.info("The number of items in the basket is checked.\n");
        int count = Integer.parseInt(findElement(TX_ITEM_COUNT).getAttribute("value"));
        if(count == 2)
            logger.info("There are 2 products.");
        else
            logger.info("The number of products is not equal");

        return this;
    }

    public CartProcess moveEmptyButton(){
        logger.info("On the delete product button");
        hoverElement(BT_CARD_EMPTY);
        return this;
    }

    public CartProcess clickEmptyButton(){
        logger.info("Click the delete product button");
        click(BT_CARD_EMPTY);
        return this;
    }

    public void clickModelDeleteButton(){
        logger.info("Click the delete product button in model");
        clickJsElement(BT_MODAL_DELETE_BUTTON);
    }


}
