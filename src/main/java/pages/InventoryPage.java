package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends Page{

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPageSection;

    public String getTextOfNameOfPageSection(){
       return nameOfMainPageSection.getText();
    }
}
