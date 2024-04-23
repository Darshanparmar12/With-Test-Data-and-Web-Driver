package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils {


    //verifying expected add to cart matches with product present in shopping cart
    String expectedShoppingCartDisplay = "Processor: 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]\n" +
            "RAM: 4GB [+$20.00]\n" +
            "HDD: 400 GB [+$100.00]\n" +
            "OS: Vista Home [+$50.00]\n" +
            "Software: Microsoft Office [+$50.00]";


    public void verifyShoppingCartPage() {
        Assert.assertEquals(getTextFromElement(By.className("sku-number")), expectedShoppingCartDisplay);
    }
}
