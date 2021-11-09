package org.testiniumtask.page;

import org.openqa.selenium.WebDriver;
import org.testiniumtask.base.BasePage;

import static org.testiniumtask.constants.Constans.*;

public class CartProcess extends BasePage {

    public CartProcess(WebDriver driver) {
        super(driver);
    }

    public CartProcess controllPrice() {
        String[] cardItemPrices = findElement(TX_CARD_PRODUCT_ITEM_PRICE).getAttribute("innerText").split(" ");
        Double cardItemPrice = Double.valueOf(cardItemPrices[0].replace(',', '.'));
        if (PRODUCT_SINGLE_PRICE != null && PRODUCT_DISCOUNT_PRICE != null) {
            if (PRODUCT_DISCOUNT_PRICE.equals(cardItemPrice)) {
                System.out.println("Ürün fiyatları tutarlı.");
            } else {
                System.out.println("Ürün fiyatları tutarsız.");
            }
        } else if (PRODUCT_DISCOUNT_PRICE == null) {
            assert PRODUCT_SINGLE_PRICE != null;
            if (PRODUCT_SINGLE_PRICE.equals(cardItemPrice)) {
                System.out.println("Ürünün sepet fiyatı ile sepetteki fiyatı eşit.");
            } else {
                System.out.println("Ürünün sepet fiyatı ile sepetteki fiyatı eşit değil.");
            }
        }

        return this;
    }

    public CartProcess moveToPlusButton(){
        hoverElement(BT_PLUS);
        return this;
    }

    public CartProcess clickPlusButton(){
        click(BT_PLUS);
        return this;
    }

    public CartProcess controlCount(){

        int count = Integer.parseInt(findElement(TX_ITEM_COUNT).getAttribute("value"));
        if(count == 2)
            System.out.println("Ürün sayısı 2 ' dir.");
        else
            System.out.println("Ürün sayısı 2 ' ye eşit değildir.");

        return this;
    }

    public CartProcess moveEmptyButton(){
        hoverElement(BT_CARD_EMPTY);
        return this;
    }

    public CartProcess clickEmptyButton(){
        click(BT_CARD_EMPTY);
        return this;
    }

    public void clickModelDeleteButton(){
        clickJsElement(BT_MODAL_DELETE_BUTTON);
    }


}
