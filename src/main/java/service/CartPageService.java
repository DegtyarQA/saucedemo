package service;

import pages.CartPage;

public class CartPageService {

    private CartPage cartPage = new CartPage();

    public String actualCartTitleText() {
        return cartPage.getCartTitleText();
    }
}
