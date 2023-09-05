package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends Page{

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPageSection;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement openCartLink;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addFirstProduct;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement removeFirstProduct;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement productQuantityIndicator;


    public String getTextOfNameOfPageSection(){
       return nameOfMainPageSection.getText();
    }


    public InventoryPage openCartPage() {
     openCartLink.click();
     return this;
    }

    public InventoryPage addFProduct() {
        addFirstProduct.click();
        return this;
    }

    public InventoryPage removeProduct(){
        removeFirstProduct.click();
        return this;
    }

    public String getQuantityProduct() {
        return productQuantityIndicator.getText();
    }

    public String getTextRemoveButton() {
        return removeFirstProduct.getText();
    }
}
