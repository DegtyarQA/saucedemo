package service;

import model.User;
import pages.CartPage;

public class CartPageService {

    private CartPage cartPage = new CartPage();
    private LoginPageService loginPageService;

    public String actualCartTitleText() {
        return cartPage.getCartTitleText();
    }

    public CartPage removeProductFromCart() {
        loginPageService = new LoginPageService();
        User user = new User();
        loginPageService.login(user);
        cartPage.removeFromCartOneProduct();
        return new CartPage();
    }

    public String actualNameProduct() {
        return cartPage.getNameProduct();
    }

    public String actualCostProduct() {
        return cartPage.getCostProduct();
    }
}
