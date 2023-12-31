package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    GearPage gearPage = new GearPage();
    HomePage homePage = new HomePage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart()
    {
        homePage.mouseHoveOnGearMenu();
        gearPage.clickOnBags();
        gearPage.productNameOvernightDuffle();
        gearPage.verifyTextOvernightDuffle();
        gearPage.changeQty3();
        gearPage.addToCart();
        gearPage.verifyTextShoppingCart();
        gearPage.shoppingCartLinkMessage();
        gearPage.verifyQty3();
        gearPage.productPrice$135();
        gearPage.changeQty5();
        gearPage.updateShoppingCartButton();
        gearPage.productPrice$225();
    }
}
