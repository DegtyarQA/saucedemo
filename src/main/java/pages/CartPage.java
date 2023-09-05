package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Page {

    @FindBy(xpath = "//div//span[@class='title']")
    private WebElement userCartTitle;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement nameProduct;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private WebElement costProduct;

    @FindBy(xpath = "//div[@id='remove-sauce-labs-backpack']")
    private WebElement removeBtn;

    public CartPage() {
    }

    public String getCartTitleText() {
        return userCartTitle.getText();
    }

    public CartPage removeFromCartOneProduct() {
        removeBtn.click();
        return this;
    }

    public String getNameProduct(){
        return nameProduct.getText();
    }

    public String getCostProduct(){
        return costProduct.getText();
    }

}
