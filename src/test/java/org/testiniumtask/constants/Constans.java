package org.testiniumtask.constants;

import org.openqa.selenium.By;

public class Constans {

    public static Double PRODUCT_SINGLE_PRICE;

    public static Double PRODUCT_DISCOUNT_PRICE;

    public static final By MOVE = By.linkText("Giriş Yap");

    public static final By TX_MAIL = By.id("LoginEmail");

    public static final By TX_PASSWORD = By.id("Password");

    public static final By BTN_LOGIN = By.id("loginLink");

    public static final By TX_SEARCH = By.id("search_input");

    public static final By BTN_SEARCH = By.tagName("button");

    public static final By BTN_LOAD_MORE_PRODUCT = By.className("lazy-load-button");

    public static final By SELECTED_PRODUCT = By.className("a_model_item");

    public static final  By BTN_SIZE = By.xpath("//div[@class='option-size']/a");

    public static final By BTN_ADD_TO_CARD = By.id("pd_add_to_cart");

    public static final By BTN_GO_TO_CARD = By.className("dd-cart");

    public static final By TX_PRODUCT_SINGLE_PRICE = By.xpath("//span[@class='price-regular']");

    public static final By TX_PRODUCT_DISCOUNT_PRICE = By.xpath("//div[@class='basket-discount']");

    public static final By TX_CARD_PRODUCT_ITEM_PRICE = By.className("rd-cart-item-price");

    public static final By BT_PLUS = By.xpath("//a[@class='oq-up plus']");

    public static final By TX_ITEM_COUNT = By.xpath("//input[@class='item-quantity-input ignored']");

    public static final By BT_CARD_EMPTY = By.xpath("//i[@class='fa fa-trash-o']");

    public static final By BT_MODAL_DELETE_BUTTON = By.xpath("//a[@class='inverted-modal-button sc-delete ins-init-condition-tracking']");

}
