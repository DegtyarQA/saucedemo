package service;

import pages.CartPage;
import pages.InventoryPage;

public class InventoryPageService {

    private InventoryPage inventoryPage = new InventoryPage();

    public String getActualNameOfMainPageSection() {
        return inventoryPage.getTextOfNameOfPageSection();
    }

    public CartPageService transitionFromInventoryPageToCartPage() {
        inventoryPage.openCartPage();
        return new CartPageService();
    }

    public void addFirstProductToCart(){
        inventoryPage.addFProduct();
    }
    public void removeFirstProductFromCart(){
        inventoryPage.removeProduct();
    }
    public String actualGetTextRemoveButton(){
        return inventoryPage.getTextRemoveButton();
    }

    public String actualProductQuantityInCart() {
        return inventoryPage.getQuantityProduct();
    }

}

