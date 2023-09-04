package service;

import pages.InventoryPage;

public class InventoryPageService {

    private InventoryPage inventoryPage = new InventoryPage();

    public String getActualNameOfMainPageSection() {
        return inventoryPage.getTextOfNameOfPageSection();
    }
}
